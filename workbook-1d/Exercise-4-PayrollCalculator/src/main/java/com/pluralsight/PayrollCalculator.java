package com.pluralsight;
import java.util.Scanner;




    public class PayrollCalculator {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String name = getName(sc);
            double hoursWorked = getHours(sc);
            double payRate = getRate(sc);

            double grossPay = calculateGrossPay(hoursWorked, payRate);

            displayResults(name, grossPay);
        }

        // ----- Methods below -----

        public static String getName(Scanner sc) {
            System.out.print("Employer Name: ");
            return sc.nextLine();
        }

        public static double getHours(Scanner sc) {
            System.out.print("Hours worked: ");
            return sc.nextDouble();
        }

        public static double getRate(Scanner sc) {
            System.out.print("Pay Rate: ");
            return sc.nextDouble();
        }

        // ✅ Single correct version of calculateGrossPay (with overtime)
        public static double calculateGrossPay(double hoursWorked, double payRate) {
            if (hoursWorked <= 40) {
                return hoursWorked * payRate;
            } else {
                double regularPay = 40 * payRate;
                double overtimePay = (hoursWorked - 40) * (payRate * 1.5);
                return regularPay + overtimePay;
            }
        }

        public static void displayResults(String name, double grossPay) {
            System.out.println("\nPayroll Summary");
            System.out.println("Employee: " + name);
            System.out.printf("Gross Pay: $%.2f%n", grossPay);
        }
    }
