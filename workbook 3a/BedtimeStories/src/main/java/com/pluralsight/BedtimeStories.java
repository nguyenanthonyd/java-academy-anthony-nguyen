package com.pluralsight;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BedtimeStories {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keepReading = true;

        while (keepReading) {
            System.out.println("\n Available Bedtime Stories:");


           Path storiesDirectory = Paths.get(".");
           java.util.<String> files = new java.util.ArrayList<>();

           try (DirectoryStream<Path> stream = Files.newDirectoryStream(storiesDirectory, "*.txt")) {
               for (Path p : stream) {
                   files.add(p.getFileName().toString());
               }
           } catch (IOException e) {
               System.out.println("Couldn't open stories shelf: " + e.getMessage());
               break;
           }

           java.util.Collections.sort(files.CASE_INSENSITIVE_ORDER);

           if (files.isEmpty()) {
               System.out.println("(No .txt stories found here. Did you unzip them in this folder?)");
               continue; // back to the top of the loop
           }
// Print the numbered meny from the list
           for (int i = 0; i < files.size(); i++) {
               System.out.printf("%02d) %s%n", (i + 1), files.get(i)); // prints 01), 02), etc.
           }

            System.out.print("\nPick a story by number or type 'exit' to quit: ");
            String choice = in.nextLine().trim();

            if (choice.equalsIgnoreCase("exit")) {
                keepReading = false;
                System.out.println("Night night!");
                break;
            }

            String fileName;
            if (choice.matches("\\d+")) {
                int pick = Integer.parseInt(choice);
                if (pick >= 1 && pick <= files.size()) {
                    fileName = files.get(pick - 1);
                } else {
                    System.out.println("That number's not on the shelf!");
                    continue; // back to menu
                }
            } else {
                fileName = choice.endsWith(".txt") ? choice : choice + ".txt";
            }

            System.out.println("\n Opening: " + fileName + " ...");
            Path path = Paths.get(fileName);
            try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String line;
                int lineNo = 1;

                while ((line = br.readLine()) != null) {
                    System.out.println(String.format("%03d. %s", lineNo, line));
                    lineNo++;
                }

                System.out.println(" End of story (" + (lineNo - 1) + " lines) -");
            } catch (IOException e) {
                System.out.println("Trouble reading that story: " + ex.getMessage());
            }
            System.out.println("\n Would you like another bedtime story? :)");
        }


    }
}