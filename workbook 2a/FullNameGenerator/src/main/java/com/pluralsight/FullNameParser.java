package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1)Start  and  2) Prompt the user
        System.out.println("Please enter your name");


        // 3) Read input & 4) Trim leading/trailing spaces
        String input = sc.nextLine().trim();

        // 5) Split into parts by one or more spaces (handles extra spaces cleanly)
        String[] parts = input.split("\\s+");
        String first, middle, last;

        //6) Decide base on number of parts
        if (parts.length == 2) {
            first = parts[0];
            middle = "(none)";
            last = parts[1];

        } else if (parts.length == 3) {
            // 6b) first middle last
            first = parts[0];
            middle = parts[1];
            last = parts[2];

        } else {
            System.out.println(" Please enter a name as 'first last' or 'first middle last'.");
            return;

        }

        System.out.println(" First name: " + first);
        System.out.println(" Middle name: " + middle);
        System.out.println(" Last name: " + last);


        sc.close();
    }




    }

