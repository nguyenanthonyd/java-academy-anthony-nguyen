package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



        // Constants
        private static final double BASE_DAILY = 29.99;
        private static final double TOLL_DAILY = 3.95;
        private static final double GPS_DAILY = 2.95;
        private static final double ROADSIDE_DAILY = 3.95;
        private static final double UNDER25_SURCHARGE = 0.30;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Inputs
            System.out.println("=== Rental Car Calculator ===");
            System.out.print("Pickup date (e.g., 2025-09-28): ");
            String pickupDate = sc.nextLine().trim();

            System.out.print("Number of rental days: ");
            int days = sc.nextInt();

            System.out.print("Electronic toll tag ($3.95/day)? (y/n): ");
            boolean toll = yes(sc);

            System.out.print("GPS ($2.95/day)? (y/n): ");
            boolean gps = yes(sc);

            System.out.print("Roadside assistance ($3.95/day)? (y/n): ");
            boolean roadside = yes(sc);

            System.out.print("Age: ");
            int age = sc.nextInt();

            // Calculations
            double basic = days * BASE_DAILY;

            double optionsPerDay = 0.0;
            if (toll)     optionsPerDay += TOLL_DAILY;
            if (gps)      optionsPerDay += GPS_DAILY;
            if (roadside) optionsPerDay += ROADSIDE_DAILY;

            double optionsTotal = optionsPerDay * days;

            double surcharge = (age < 25) ? (basic * UNDER25_SURCHARGE) : 0.0;

            double total = basic + optionsTotal + surcharge;

            // Output
            System.out.println("--- Reservation Summary ---");
            System.out.println("Pickup date: " + pickupDate);
            System.out.println("Days: " + days);
            System.out.printf("Basic car rental: $%.2f%n", basic);
            System.out.printf("Options cost:     $%.2f%n", optionsTotal);
            System.out.printf("Underage surcharge: $%.2f%n", surcharge);
            System.out.printf("TOTAL:            $%.2f%n", total);
        }

        private static boolean yes(Scanner sc) {
            String ans = sc.next().trim();
            return ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes");
        }
    }
