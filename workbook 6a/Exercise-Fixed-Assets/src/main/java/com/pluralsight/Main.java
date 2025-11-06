package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // simple test
                BankAccount account = new BankAccount(5000);
                CreditCard card = new CreditCard(2000);

                account.deposit(300);
                card.charge(500);

                System.out.println("Bank Account Value: $" + account.getValue());
                System.out.println("Credit Card Value: $" + card.getValue());
            }

}


