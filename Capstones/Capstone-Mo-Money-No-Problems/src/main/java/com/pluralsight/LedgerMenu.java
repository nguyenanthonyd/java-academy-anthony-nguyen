package com.pluralsight;

import java.util.Scanner;

public class LedgerMenu {

    public static void homeScreen() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nWelcome to Mo Money No Problems");
            System.out.println("D) Add Desposit");
            System.out.println("P) Make Payment (Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit ");

        choice = scanner.nextLine().toUpperCase().charAt(0); // chain of method that reads user input from the keyboard,
                                                             //  converts to uppercase and takes the first character.

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
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");

        }

        } while (choice != 'X');

        scanner.close();
}
