package com.pluralsight;

import java.util.Scanner;


public class LedgerScreen {

    public static void ledgerScreen() {


        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
        System.out.println("\n===$$$ Ledger Menu $$$===");
        System.out.println("A) All - Displays all entries");
        System.out.println("D) Deposits - Displays only the entries that are deposits into the account");
        System.out.println("P) Payments - Display only the negative entries (or payments)");
        System.out.println("R) Reports - A new screen that allows the user to run pre-defined\n" +
                "reports or to run a custom search ");
        System.out.println("H) Home - Go back to the Home Screen");
        System.out.println("X) Exit - Close the application");
        System.out.println("===$$$ Pick yo poison tell me watcha doin': $$$===");
        choice = scanner.nextLine().toUpperCase().charAt(0);
        // Chain of method that reads user input from the keyboard,
        // Converts to uppercase and takes the first character.

        switch (choice) {
            case 'A':
                System.out.println("All - Display all entries");
                break;

            case 'D':
                System.out.println("Deposits - Displays only the entries that are deposits into the account");
                break;

            case 'P':
                System.out.println("Payments - Display only negative entries (or payments)");
                // switches to ledger page with different options
                break;

            case 'R':
                System.out.println("Reports - A new screen that allows the user to run pre-defined reports or to run " +
                                    "a custom search");
                break;

            case 'H':
                System.out.println("Home - Let's hop back to the home screen!");
                // Goes back to home screen
                break;

                default:
                System.out.println("Oh snap, invalid choice! Try again!");

        }

    } while (choice != 'X' && choice !='H');


}
}



