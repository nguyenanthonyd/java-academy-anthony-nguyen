package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;

public class LedgerScreen {

    public static void ledgerScreen() {


        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===$$$ LEDGER MENU $$$===");
            System.out.println("A) All - Displays all entries");
            System.out.println("D) Deposits - Displays only the entries that are deposits into the account");
            System.out.println("P) Payments - Display only the negative entries (or payments)");
            System.out.println("R) Reports - A new screen that allows the user to run pre-defined\n" +
                    "reports or to run a custom search ");
            System.out.println("H) Home - Go back to the Home Screen");
            System.out.println("X) Exit - Close the application");
            System.out.println("===$$$ Pick yo poison tell me watcha doin': $$$===");
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                choice = ' ';
            } else {
                choice = scanner.nextLine().toUpperCase().charAt(0);
            }
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
                    ReportScreen.reportScreen();
                    break;

                case 'H':
                    System.out.println("Home - Let's hop back to the home screen!");
                    // Goes back to home screen
                    break;

                case 'X':
                    System.out.println("Exit- Let's get outta here!");
                    // Exits
                    break;

                default:
                    System.out.println("Oh snap, invalid choice! Try that again playa!");


            }

        } while (choice != 'X' && choice != 'H');


    }

    public void displayAllTransactions(ArrayList<Transaction> transactionList) {
        System.out.println("\n===$$$ FULL TRANSACTION LIST (Most Recent First) $$$===");

        for (var i = transactionList.size() - 1; i >= 0; i--) {
            System.out.println(transactionList.get(i).toString());
        }
    }

    public void displayAllDeposits(ArrayList<Transaction> transactionList) {
        System.out.println("\n\n=== LEDGER DEPOSIT LIST (Most Recent First) ===");

        for (var i = transactionList.size() - 1; i >= 0; i--) {
            if (transactionList.get(i).getAmount() >= 0) {
                System.out.println(transactionList.get(i).toString());
            }
        }
    }

    public void displayAllPayments(ArrayList<Transaction> transactionList) {
        System.out.println("\n\n=== LEDGER PAYMENT LIST (Most Recent First) ===");

        for (var i = transactionList.size() - 1; i >= 0; i--) {
            if (transactionList.get(i).getAmount() < 0) {
                System.out.println(transactionList.get(i).toString());
            }
        }

    }
}