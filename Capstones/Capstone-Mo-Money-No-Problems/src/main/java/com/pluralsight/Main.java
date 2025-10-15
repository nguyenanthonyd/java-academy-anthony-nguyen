package com.pluralsight;

import  java.util.ArrayList;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        LedgerMenu.homeScreen(); // Called my menu here
        Transaction t = new Transaction("2025-10-12", "08:30:00", "Coffee", "Starbucks",
                - 8.50);
        System.out.println("Description: " + t.getDescription());
        System.out.println("Amount: $" + t.getAmount());

        ArrayList<Transaction> ledger = new ArrayList<>(); // Loop variable  is called transaction

        ledger.add(new Transaction("2025-10-12", "09:20:00", "Energy Drink", "7- Eleven" ,- 4.25));
        ledger.add(new Transaction("2025-10-12", "12:05:00", "Iced Coffee", "Starbucks", - 6.00));

        double total = 0; //  The total variable is outside loop for accumulation

        for (Transaction transaction : ledger) {
            System.out.println(transaction.getDescription() + ": $" + transaction.getAmount());
            total += transaction.getAmount(); // total +=





        }

    }
}


// Application Requirements
//Your application must include several screens with the listed features in order to
//be considered complete:
//• Home Screen
//o The home screen should give the user the following options. The
//application should continue to run until the user chooses to exit.
//§ D) Add Deposit - prompt user for the deposit information and
//save it to the csv file
//§ P) Make Payment (Debit) - prompt user for the debit
//information and save it to the csv file
//§ L) Ledger - display the ledger screen
//§ X) Exit - exit the application
//• Ledger - All entries should show the newest entries first
//o A) All - Display all entries
//o D) Deposits - Display only the entries that are deposits into the
//account
//o P) Payments - Display only the negative entries (or payments)
//o R) Reports - A new screen that allows the user to run pre-defined
//reports or to run a custom search
//§ 1) Month To Date
//§ 2) Previous Month
//§ 3) Year To Date
//§ 4) Previous Year
//§ 5) Search by Vendor - prompt the user for the vendor name
//and display all entries for that vendor
//§ 0) Back - go back to the Ledger page
//o H) Home - go back to the home page