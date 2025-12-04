package com.pluralsight.finance;

public class CreditCard implements  Valuable {
    private double balance;

        public CreditCard(double balance) {
        this.balance = balance; // Constructor
    }
    public void charge (double amount) {
        balance += amount;
    }
    public void pay (double amount) {
        balance -= amount;
    }
    @Override
    public double getValue() {
        return -balance; // debt lowers net worth
    }
}


