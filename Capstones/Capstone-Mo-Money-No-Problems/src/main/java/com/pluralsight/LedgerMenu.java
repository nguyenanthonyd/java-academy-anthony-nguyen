package com.pluralsight;

import java.util.Scanner;

public class LedgerMenu {

    public static void homeScreen() {

        // Run the homeScreen in a do- while loop until the user exits the menu.
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n$$$ Mo Money No Problems Menu $$$");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment (Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit ");

            choice = scanner.nextLine().toUpperCase().charAt(0);
            // Chain of method that reads user input from the keyboard,
            // Converts to uppercase and takes the first character.

            switch (choice) {
                case 'D':
                    System.out.println("Add Deposit selected");
                    break;

                case 'P':
                    System.out.println("Make Payment selected");
                    break;

                case 'L':
                    System.out.println("Ledger selected");
                    break;

                case 'X':
                    System.out.println("Peace!");
                    break;
                default:
                    System.out.println("Oh snap, invalid choice! Please try again!");

            }

        } while (choice != 'X');

        scanner.close();
    }
}