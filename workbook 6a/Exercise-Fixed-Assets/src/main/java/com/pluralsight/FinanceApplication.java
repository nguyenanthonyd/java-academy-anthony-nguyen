package com.pluralsight;

import com.pluralsight.finance.*;
import com.pluralsight.finance.BankAccount;

import  java.util.*;


public class FinanceApplication {
    public static void main(String[] args) {
        List<Valuable> items = new ArrayList<>();

        BankAccount account1 = new BankAccount(123, "Trunks", 1240);
        Valuable account2 = new BankAccount(122, "Goten", 1239);

        account1.deposit(100);
        // account2.deposit(100); not allowed because reference is Valuable

        System.out.println("Account 1 value:" + account1.getValue());
        System.out.println("Account 2 value:" + account2.getValue());
    }
}