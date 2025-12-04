package com.pluralsight;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BedtimeStories {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keepReading = true;


            Path storiesDirectory = Paths.get("stories");
            System.out.println("Looking in: " + storiesDirectory.toAbsolutePath());


            while (keepReading) {
                System.out.println("\nAvailable Bedtime Stories:");
                java.util.List<String> files = new java.util.ArrayList<>();
                // === Building the Menu ===


                try (DirectoryStream<Path> stream = Files.newDirectoryStream(storiesDirectory, "*.txt")) {
                    for (Path p : stream) {
                        files.add(p.getFileName().toString());
                    }
                } catch (IOException e) {
                    System.out.println("Couldn't open stories shelf: " + e.getMessage());
                    break;
                }

                Collections.sort(files, String.CASE_INSENSITIVE_ORDER);

                if (files.isEmpty()) {
                    System.out.println("(No .txt stories found here. Did you unzip them in this folder?)");
                    // Ask whether to try again or exit
                    System.out.print("Type 'exit' to quit, or press Enter to check again:");
                    String again = in.nextLine().trim();
                    if (again.equalsIgnoreCase("exit")){
                        System.out.println("Night night!");
                        break;
                    }
                    continue; // back to the top of the loop
                }
// Print the numbered menu  from the list
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
                if (choice.matches("\\d+")) { // \\d+ one more digits
                    int pick = Integer.parseInt(choice);
                    if (pick < 1 || pick > files.size()) {
                        System.out.println("That number's not on the shelf!");
                        continue;
                    }
                    fileName = files.get(pick - 1);
                } else {
                    fileName = choice.endsWith(".txt") ? choice : choice + ".txt";
                    if (!files.contains(fileName)) {
                        System.out.println("That story isn't on this shelf. Try a menu number or exact name.");
                        continue;
                    }
                }

                // 2 Open the file from FOLDER (Main bug)
                Path path = storiesDirectory.resolve(fileName);
                System.out.println("\n Opening: " + fileName + " ...");
                System.out.println("\n Path:" + path.toAbsolutePath());

                try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                    String line;
                    int lineNo = 1;
                    while ((line = br.readLine()) != null) {
                        System.out.println(String.format("%03d. %s", lineNo, line));
                        lineNo++;
                    }

                    System.out.println(" End of story (" + (lineNo - 1) + " lines).");
                } catch (IOException e) {
                    System.out.println("Trouble reading that story: " + e.getMessage());
                }
                System.out.println("\nWould you like another bedtime story? (y/n): ");
                String again = in.nextLine().trim();
                if (!again.equalsIgnoreCase("y")) {
                    keepReading = false;
                    System.out.println("Night night!");
                }

            }
    }
}