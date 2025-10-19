package com.pluralsight;

public class PayRollFile {
    private final int id;
    private final String name;
    private final double grossPay;

    public PayRollFile(int id, String name, double grossPay) {
        this.id = id;
        this.name = name;
        this.grossPay = grossPay;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrossPay() {
        return grossPay;
    }
}


