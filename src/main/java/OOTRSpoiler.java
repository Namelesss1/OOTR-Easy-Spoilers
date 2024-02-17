import com.sun.javaws.exceptions.InvalidArgumentException;
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
            worldCount = (long)this.getSettings("world_count");
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
     * @return randomizer version
     */
    public String getVersion() {
        return (String)spoilerJSON.get(":version");
    }


    /**
     * @return the five icons displayed on the menu screen, used for quick identification of seed
     */
    public String[] getFileHash() {
        JSONArray jsonHashArray = (JSONArray)spoilerJSON.get("file_hash");
        Object[] hashArray = jsonHashArray.toArray();

        return Arrays.asList(hashArray).toArray(new String[hashArray.length]);
    }

    /**
     * @return the seed of this randomized instance
     */
    public String getSeed() {
        return (String)spoilerJSON.get(":seed");
    }

    /**
     * @return return string representing the chosen settings
     */
    public String getSettingsString() {
        return (String)spoilerJSON.get(":settings_string");
    }

    /**
     * @return true or false whether distribution file was enabled
     */
    public boolean getEnableDistributionFile() {
        return (boolean)spoilerJSON.get(":enable_distribution_file");
    }

    /**
     * Returns individual settings of the randomizer seed, or all settings in a JSON Object
     * @param setting an empty string for all settings, or the name/alias of a specific desired setting
     * @return the selected settings that were set upon the randomizer, or null if not found.
     */
    public Object getSettings(String setting) {
        JSONObject settingsObj = (JSONObject)spoilerJSON.get("settings");

        if (setting.equals("all")) {
            return jsonObjToString(settingsObj);
        }

        /*
         * In this case, the user asks for a specific setting. Search to see
         * if their chosen setting matches any aliases. If so, return the setting
         * value. Otherwise, return null for not found.
         */
        Map<String, String[]> settingsAliases = Aliases.settingsAliases();
        Set<String> settingsKeys = settingsAliases.keySet();
        for (String key : settingsKeys) {
            for (String alias : settingsAliases.get(key)) {
                if (setting.equalsIgnoreCase(alias)) {
                    return settingsObj.get(settingsAliases.get(key)[0]);
                }
            }
        }

        return null;
    }

    /**
     * Returns individual randomized settings of the randomizer seed, or all settings in a JSON Object
     * args[1] = world num if multiworld. or name/alias of specific desired setting
     * args[2] = name/alias of specific desired setting if multiworld.
     * @param args "all" for all settings, or the name/alias of a specific desired setting
     * @return the selected settings that were set upon the randomizer, or null if not found.
     */
    public Object getRandomizedSettings(String[] args) {

        JSONObject obj = (JSONObject)spoilerJSON.get("randomized_settings");
        JSONObject settingsObj;
        String setting;

        /* Determine which arg to use based on whether it is multiworld or not
         * if multiworld, grab JSONObject for that world. */
        if (worldCount > 1) {
            settingsObj = (JSONObject)obj.get("World " + args[1]);
            setting = (args.length < 3) ? "all" : args[2];
        }
        else {
            settingsObj = obj;
            setting = (args.length < 2) ? "all" : args[1];
        }


        if (setting.equals("all")) {
            return jsonObjToString(settingsObj);
        }

        /*
         * In this case, the user asks for a specific setting. Search to see
         * if their chosen setting matches any aliases. If so, return the setting
         * value. Otherwise, return null for not found.
         */
        Map<String, String[]> settingsAliases = Aliases.settingsAliases();
        Set<String> settingsKeys = settingsAliases.keySet();
        for (String key : settingsKeys) {
            for (String alias : settingsAliases.get(key)) {
                if (setting.equalsIgnoreCase(alias)) {
                    return settingsObj.get(settingsAliases.get(key)[0]);
                }
            }
        }

        return null;
    }

    /**
     * Returns amount of an specified item in a seed, or all amounts if non specified
     * args[1] = world num if multiworld. or name of item.
     * args[2] = name of item if multiworld.
     * @param args "all" for all items, or the name/alias of a specific desired item
     * @return the selected settings that were set upon the randomizer, or null if not found.
     */
    public Object getItemPool(String[] args) {
        JSONObject obj = (JSONObject)spoilerJSON.get("item_pool");
        JSONObject itemPoolObj;
        String itemName;

        /* Determine which arg to use based on whether it is multiworld or not
         * if multiworld, grab JSONObject for that world. */
        if (worldCount > 1) {
            itemPoolObj = (JSONObject)obj.get("World " + args[1]);
            itemName = (args.length < 3) ? "all" : args[2];
        }
        else {
            itemPoolObj = obj;
            itemName = (args.length < 2) ? "all" : args[1];
        }


        if (itemName.equals("all")) {
            return jsonObjToString(itemPoolObj);
        }

        List<String> chosenItem = null;
        for (String[] item : Aliases.itemAliases()) {
            for (String alias : item) {
                if (alias.equalsIgnoreCase(itemName)) {
                    chosenItem = new ArrayList<>(Arrays.asList(item));
                }
            }
        }

        if (chosenItem == null) {
            throw new IllegalArgumentException("Argument passed is not a recognized item name.");
        }

        JSONObject relevantItems = new JSONObject();
        for (Object key : itemPoolObj.keySet()) {
            String keyString = (String)key;
            if (chosenItem.contains(keyString)) {
                relevantItems.put(key, itemPoolObj.get(key));
            }
        }

        return jsonObjToString(relevantItems);
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
    public Object get(String[] args) {

        Map<String,String[]> keyAliases = Aliases.keyAliases();
        Set<String> keys = keyAliases.keySet();
        for (String key : keys) {
            for (String alias : keyAliases.get(key)) {
                if (args[0].equalsIgnoreCase(alias)) {
                    return getSpoilerLogKey(keyAliases.get(key)[0], args);
                }
            }
        }

        return null;
    }


    private Object getSpoilerLogKey(String key, String[] args) {
        switch (key) {
            case "version":
                return getVersion();
            case "file_hash":
                return getFileHash();
            case "seed":
                return getSeed();
            case "settings_string":
                return getSettingsString();
            case "enable_distribution_file":
                return getEnableDistributionFile();
            case "settings":
                if (args.length > 1) {
                    return getSettings(args[1]);
                }
                else {
                    return getSettings("all");
                }

            case "randomized_settings":
                verifyMultiworldArgs(args);
                return getRandomizedSettings(args);

            case "item_pool":
                verifyMultiworldArgs(args);
                return getItemPool(args);
            default:
                return null;
        }
    }


    /**
     * Converts a jsonObject into a better-formatted string to display.
     * @param obj jsonObject to read information from and convert
     * @return a formatted string with all info from obj
     */
    private String jsonObjToString(JSONObject obj) {
        String objStr = obj.toString();
        String res = "";

        res = objStr.replaceAll("\\{", "");
        res = res.replaceAll("\\}", "");
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
