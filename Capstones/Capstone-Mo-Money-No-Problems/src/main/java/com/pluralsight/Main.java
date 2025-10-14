package com.pluralsight;
import java.lang.reflect.Array;
import  java.util.ArrayList;
import java.io*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LedgerMenu.homeScreen(); // Called my menu hereits
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
            total += transaction.getAmount() // total +=



        }

    }
}
