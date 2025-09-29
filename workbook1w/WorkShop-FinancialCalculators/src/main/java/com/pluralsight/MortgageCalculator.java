package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Workshop 1w
        // Mortgage calculator
        // Inputs

        System.out.println("Loan Principal:"); // (P)
        double principal = sc.nextDouble();

        System.out.println("Annual Interest Rate:"); // (r)(7.625%)
        double interestRate = sc.nextDouble(); // to convert percent to decimal. User types in 7.625 for 7.625%
        interestRate = interestRate / 100; // to convert into a decimal (0.07625)

        System.out.println("Enter Loan Term in Years:"); // (y)
        int year = sc.nextInt();

        // Derived Values

        System.out.println("Number of Monthly Payments:"); // (n)
        int numberOfMonthlyPayments = year * 12; // number of payments * 12 (12 months in a year)

        System.out.println("Monthly Interest Rate:"); // (i)
        double  monthlyInterestRate = interestRate / 12; // annual interest rate divided by 12 ( r/12)

        double monthlyPayment = principal * ( interestRate * Math.pow(1 + interestRate, numberOfMonthlyPayments)) /
                (Math.pow(1 + interestRate, numberOfMonthlyPayments)- 1);

        System.out.println("Total Interest:");
        double totalInterest = (monthlyPayment *  numberOfMonthlyPayments) - principal;

        System.out.printf("Monthly Payment:$%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid : $%.2f%n" , totalInterest);

    }
}