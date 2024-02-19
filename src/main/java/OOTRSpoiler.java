import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class OOTRSpoiler {

    private JSONObject spoilerJSON; /* Content of spoiler log, in a ready to use JSON.simple object */

    private long worldCount; /* How many worlds this log represents */

    private String multiworld_err_msg = "This is a multiworld spoiler. " +
            "Please specify a world with an integer " +
            "e.g. 1 or 2 etc. up to your total world count which is " + worldCount;

    public OOTRSpoiler(String spoilerIn, boolean isPath) throws IOException, ParseException {
        String spoilerText;

        if (!isPath) {
            spoilerText = spoilerIn;
        }
        else {
            byte[] fileBytes = Files.readAllBytes(Paths.get(spoilerIn));
            spoilerText = new String(fileBytes);
        }

        JSONParser parser = new JSONParser();
        spoilerJSON = (JSONObject)parser.parse(spoilerText);

        if (this.isValid()) {
            String[] args = {"settings", "world_count"};
            JSONObject worldCountObj = (JSONObject)this.getSubKey(args, "settings", Aliases.AliasType.SETTINGS);
            worldCount = (Long)worldCountObj.get("world_count");
            System.out.println("World Count: " + worldCount);
        }
        else {
            worldCount = -1;
        }

    }

    /**
     * This method checks whether the spoiler log represented by this object is a valid one.
     * A spoiler log is valid if it is in correct JSON Format, and contains
     * all keys within a spoiler log file (the keys may differ depending on randomizer version)
     *
     * @return true if this spoiler log is valid, false if invalid.
     */
    public boolean isValid() {
        if (spoilerJSON == null) return false;

        return true;
    }



    /**
     * This method returns any information from the spoiler log.
     * The passed argument args consists of the following structure:
     *
     * arg[0] - The top-most alias of the key to search in the spoiler log
     * arg[1] and above - Additional data to retrieve within the key represented by arg[0]
     *
     * @param args any potential arguments describing a user's request e.g. specific settings or a key.
     * @return Information from the spoiler log requested by the args array, or null if invalid arg[0] passed.
     */
    public JSONObject get(String[] args) {

        String[][] keyAliases = Aliases.keyAliases();
        for (String[] keyType : keyAliases) {
            for (String alias : keyType) {
                if (args[0].equalsIgnoreCase(alias)) {
                    return getSpoilerLogKey(keyType[0], args);
                }
            }
        }

        return null;
    }


    private JSONObject getSpoilerLogKey(String key, String[] args) {
        JSONObject obj = new JSONObject();

        switch (key) {
            case "version":
                obj.put(":version", getKey(":version"));
                return obj;
            case "file_hash":
                obj.put("file_hash", getKey("file_hash"));
                return obj;
            case "seed":
                obj.put(":seed", getKey(":seed"));
                return obj;
            case "settings_string":
                obj.put(":settings_string",getKey(":settings_string"));
                return obj;
            case "enable_distribution_file":
                obj.put(":enable_distribution_file", getKey(":enable_distribution_file"));
                return obj;
            case "settings":
                return getSubKey(args, "settings", Aliases.AliasType.SETTINGS);
            case "randomized_settings":
                verifyMultiworldArgs(args);
                return getSubKeyMultiworld(args, "randomized_settings", Aliases.AliasType.SETTINGS);
            case "item_pool":
                verifyMultiworldArgs(args);
                return getSubKeyMultiworld(args, "item_pool", Aliases.AliasType.ITEMS);
            default:
                return null;
        }
    }


    /**
     * Returns a JSONObject for a key representing the top-most level of a spoiler
     * file.
     * @param keyName name of top-level key
     * @return A JSONObject representing the key and value of keyName
     */
    public Object getKey(String keyName) {
        return spoilerJSON.get(keyName);
    }



    /**
     * Returns a specified subkey in a seed, or all subkeys if non specified
     *
     * args[1] = name of specific key. "All" by default if none exists
     * @param args "all" for all subkeys, or the name/alias of a specific desired subkey
     * @param superKey name of the superkey subkey belongs to.
     * @param type type of alias to consider
     * @return the selected info contained within subkey.
     */
    public JSONObject getSubKey(String[] args, String superKey, Aliases.AliasType type) {
        JSONObject subKeyObj = (JSONObject)spoilerJSON.get(superKey);
        String subKeyName = (args.length < 2) ? "all" : args[1];

        return subKey(subKeyObj, subKeyName, type);
    }



    /**
     * Same as get subKey, but this takes care of keys with potential extra information
     * relating to multiworld.
     *
     * Returns a specified subkey in a seed, or all subkeys if non specified
     * args[1] = world number
     * args[2] = name of specific key. Set to "all" by default if none specified
     * @param args "all" for all subkeys, or the name/alias of a specific desired subkey
     * @param superKey name of the superkey subkey belongs to.
     * @param type type of alias to consider
     * @return the selected info contained within subkey.
     */
    public JSONObject getSubKeyMultiworld(String[] args, String superKey, Aliases.AliasType type) {
        JSONObject obj = (JSONObject)spoilerJSON.get(superKey);
        JSONObject subKeyObj = (JSONObject)obj.get("World " + args[1]);
        String subKeyName = (args.length < 3) ? "all" : args[2];

        return subKey(subKeyObj, subKeyName, type);
    }


    /**
     * Helper to extract data from specified keyObj based on keyName
     *
     * @param keyObj JSONObject containing all data
     * @param keyName name of specific subkey to extract
     * @param type specifies which aliases to look up when matching keyName
     * @return an object representing the extracted info.
     */
    private JSONObject subKey(JSONObject keyObj, String keyName, Aliases.AliasType type) {
        if (keyName.equals("all")) {
            return keyObj;
        }

        /* Determine which aliases to look for based on alias */
        String[][] aliases = Aliases.getAliases(type);

        List<String> chosen = null;
        for (String[] element : aliases) {
            for (String alias : element) {
                if (alias.equalsIgnoreCase(keyName)) {
                    chosen = new ArrayList<>(Arrays.asList(element));
                }
            }
        }

        if (chosen == null) {
            throw new IllegalArgumentException("Argument passed is not a recognized item name.");
        }

        JSONObject relevantItems = new JSONObject();
        for (Object key : keyObj.keySet()) {
            String keyString = (String)key;
            if (chosen.contains(keyString)) {
                relevantItems.put(key, keyObj.get(key));
            }
        }

        return relevantItems;
    }



    /**
     * Converts a jsonObject into an easier-to-read string to display.
     * @param obj jsonObject to read information from and convert
     * @return a formatted string with all info from obj
     */
    public static String jsonObjToString(JSONObject obj) {
        String objStr = obj.toString();
        String res = "";

        res = objStr.replaceAll("\\{", "");
        res = res.replaceAll("\\}", "");
        res = objStr.replaceAll("\\[", "");
        res = objStr.replaceAll("]", "");
        res = res.replaceAll(",", "\n");

        return res;
    }


    /**
     * If this spoiler log represents a multiworld, this method ensures
     * the correctness of args[1] which should specify a world number.
     * It is correct if it is an integer between 1 and worldCount (incl)
     * If not correct, throws an IllegalArgumentException
     *
     * @param args arguments to test
     */
    private void verifyMultiworldArgs(String[] args) {

        /*  must specify a world if multiworld */
        if (worldCount > 1 && args.length < 2) {
            throw new IllegalArgumentException(multiworld_err_msg);
        }

        /* args[1] must be an integer within 1 <= x <= world_count range */
        if (worldCount > 1) {
            int count;
            try {
                count = Integer.parseInt(args[1]);
            }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException(multiworld_err_msg);
            }
            if (count > worldCount) {
                throw new IllegalArgumentException(multiworld_err_msg);
            }
        }
    }

}
