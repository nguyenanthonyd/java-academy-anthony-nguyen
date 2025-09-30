package com.pluralsight;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            // Main menu:
            System.out.println("\n=== Financial Calculators ===");
            System.out.println("1. Mortgage Payment & Total Interest");
            System.out.println("2. Future Value of One-Time Deposit (Daily Compounding)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            // Helpers
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> mortgageCalculator(sc);
                case 2 -> futureValue(sc);
                case 3 -> {
                    System.out.println("Goodbye!");
                    sc.close();

                    return;
                }
                default -> System.out.println("Invalid choice. Please select 0-3.");
            }
        }
    }
        // 1.Mortgage Calculator
        // This calculator would use a compounded interest formula.
        //M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
        private static void mortgageCalculator(Scanner sc) {

            System.out.println("\n === Mortgage Calculator ===");
            System.out.println("Loan Principal:"); // (P)
            double principal = sc.nextDouble();

            System.out.println("Annual Interest Rate:"); // (r)(7.625%)
            double annualRate = sc.nextDouble(); // to convert percent to decimal. User types in 7.625 for 7.625%. annualRate = (r)
            annualRate = annualRate / 100; // to convert into a decimal (0.07625) // r= r/100

            System.out.println("Enter Loan Term in Years:"); // (y)
            int years = sc.nextInt();

            int n = years * 12;  // number of monthly payment(n) = years(y) * 12. (12 monthly payments per year).
            double i = annualRate / 12.0; // monthly interest rate. annualRate (r). ex. r / 12

            double monthlyPayment;
             if (i== 0.0) {

            monthlyPayment = principal / n ; // M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)

            } else {
                double pow = Math.pow(1 + i, n);
                monthlyPayment = principal * (i * pow) / (pow - 1);
            }

            double totalInterest = (monthlyPayment * n) - principal;  //Total Interest: (M * n) - P


            System.out.printf("Number of Monthly Payments (n): %d%n", n);
            System.out.printf("Monthly Interest Rate (i): %.8f%n", i);
            System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
            System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);
        }

        // 2. Future Value Calculator ( Compounding Interest)
        //FV = P × (1 + (r / 365) )^(365 × t)

        private static void futureValue(Scanner sc) {


            System.out.println("Initial Deposit Amount:"); // Principle (P)
            double P = sc.nextDouble();

            System.out.println("Annual Interest Rate:"); // Annual Interest Rate (r)
            double annualRatePercent = sc.nextDouble();
            double r = annualRatePercent / 100.0;

            System.out.println("Number of Years:"); // (t)
            int t = sc.nextInt();

            int daysPerYear = 365;
            int totalDays = daysPerYear * t;
            // Days Per Year: Daily compounding assumes 365 days per year
           // 365 x t ( 365 days in a year)


            double futureValue = P * Math.pow(1 + (r / daysPerYear),totalDays);
            double totalInterestEarned = futureValue - P; // Total Interest : FV - P
            System.out.printf("Total Number of Days: %d%n", totalDays);
            System.out.printf("Future Value after %d years: $%.2f%n", t, futureValue);
            System.out.printf("Total Interest Earned:$%.2f%n", totalInterestEarned);





        }


}


