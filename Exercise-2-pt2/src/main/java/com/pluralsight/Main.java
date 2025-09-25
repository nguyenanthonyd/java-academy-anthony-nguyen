package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Step 2


        int numberOfDays = 7; // days in week
        double priceOfCoffee = 4.99; // without dollar sign
        char favoriteLetter = 'A';
        boolean isRaining = false;

        System.out.printf("Almost all " + numberOfDays + " days of the week,");

        System.out.printf("I buy a coffee for $" + priceOfCoffee);

        System.out.printf(". Even the cashiers knows my name and calls me " + "'" + favoriteLetter + "'.");

        if (isRaining) {
            System.out.print(" Can't get coffee today since it is raining sadly!");
    }
    else
            System.out.printf(" Well, time to get some coffee!");
        }

}