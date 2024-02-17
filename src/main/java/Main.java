import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String spoilerInput = "";
        boolean isPath;
        OOTRSpoiler spoiler = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("The spoiler log can be input from either a file or pasted.");
        System.out.println("Will the spoiler log be coming from a file? Type yes if so, anything else otherwise.");

        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Now enter the path to use: ");
            isPath = true;
        }
        else {
            System.out.println("Now paste the spoiler log here: ");
            isPath = false;
        }

        spoilerInput = scanner.nextLine();
        try {
            spoilerInput = "samplespoilers/multiworldv8.json"; //FOR DEBUGGING
            spoiler = new OOTRSpoiler(spoilerInput, isPath);
        }
        catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }


        while (true) {
            System.out.println("Enter what you are looking for.");
            response = scanner.nextLine();
            String[] spoilerArgs = response.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            for (int i = 0; i < spoilerArgs.length; i++) {
                spoilerArgs[i] = spoilerArgs[i].replaceAll("\"", "").trim();
            }
            System.out.println("Arg Tokens: " + Arrays.toString(spoilerArgs));

            System.out.println(spoiler.get(spoilerArgs));
            System.out.println("-------------------------------");
        }

    }
}
