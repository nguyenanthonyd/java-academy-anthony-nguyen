package com.pluralsight;
import java.util.Scanner;


public class FutureValue { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // WorkShop 1w
    // Calculator 2 - Determines the future value of a one- time deposit assuming compound interest.
    // Inputs
    System.out.println("Initial Deposit Amount:"); // Principle (P):\
    double P = sc.nextDouble();

    System.out.println("Annual Interest Rate:"); // Annual Interest Rate (r)
    double r = sc.nextDouble(); // to convert percentage into a decimal
    r = r / 100; // to convert into a decimal 1.75

    System.out.println("Number of Years:"); // (t)
    int t = sc.nextInt();


    // Days Per Year: Daily compounding assumes 365 days per year
    System.out.println("Number of Days:"); // 365 x t ( 365 days in a year)
    int numberOfDays = 365 * t;

    double futureValue = P * Math.pow(1 + (r / 365 ), (365 * t));

            System.out.println("Total Interest Earned:");
    double totalInterestEarned = futureValue - P;
    System.out.printf("Future Value after %d years: $%.2f%n", t, futureValue);
    System.out.printf("Total Interest Earned:      $%.2f%n", totalInterestEarned);

    sc.close();
}
}