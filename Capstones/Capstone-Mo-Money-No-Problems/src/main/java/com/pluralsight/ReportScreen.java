package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;

public class ReportScreen {


        // Shows Report Screens and user choices
    public static void reportScreen(ArrayList<Transaction> transactions) {

        ReportScreen reportScreen = new ReportScreen();
        Scanner scanner = new Scanner(System.in);

        char choice = ' ';

        do {
            System.out.println("\n===$$$ REPORT MENU $$$===");
            System.out.println("1) Month To Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year to Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search by Vendor - prompt the use for the vendor name and display all it's entries");
            System.out.println("0) Back - Go back to Ledger page");
            System.out.println("===$$$ Pick yo poison tell me watcha doin' $$$===");

            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("No input detected yo. Choose a number from the menu homie/homette");
                continue;
            }

            choice = line.charAt(0); // digits don't need uppercase like other screens

                switch (choice) {

                    case '1':
                        System.out.println("Display all transactions in the current month");
                        break;
                    case '2':
                        System.out.println("Display all transactions in the previous month");
                        break;
                    case '3':
                        System.out.println("Display all transactions in the current year");
                        break;
                    case '4':
                        System.out.println("Display all transactions in the previous year");
                        break;
                    case '5':
                        System.out.println("Search by vendor and show matching transactions");
                        break;
                    case '0':
                        System.out.println("Return to the Ledger Screen");
                        return;
                    default:
                        System.out.println("Oh snap, invalid choice! Try that again playa!");
                        break;
                }

            } while (choice != '0');
        }
    }
