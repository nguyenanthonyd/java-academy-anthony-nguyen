package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sandwich Shop Exercise


        double basePriceRegular = 5.45;
        double basePriceLarge = 8.95;
        double loadedPriceRegular = 1.00;
        double loadedPriceLarge = 1.75;

        System.out.println(" Welcome to Sam's Sandwiches!");

        System.out.println(" Choose a size:"); // Prompt for size (regular/large)
        System.out.println(" 1: Regular $" + basePriceRegular);
        System.out.println(" 2: Large $" + basePriceLarge);
        int size = sc.nextInt();

        System.out.println("3.Add loaded option? ");
        System.out.println(" 3: Yes");
        System.out.println(" 4: No ");
        int loaded = sc.nextInt();

        System.out.println(" Age:");
        int age = sc.nextInt();

        String sizeLabel = "";
        double basePrice = 0.0;
        double discountRate = 0.0;


        String discountLabel = " No discount ";


        if (size == 1) {
            basePrice = basePriceRegular;
            sizeLabel = "Regular";
        } else if (size == 2) {
            basePrice = basePriceLarge;
            sizeLabel = "Large";

        } else {
            System.out.println("Invalid size: ");
            return; // to stop program

        }
        System.out.println("Base Price: $" + basePrice);

        if (loaded == 3) {

        if (size == 1) {
            basePrice += loadedPriceRegular;
        } else if (size == 2) {
            basePrice += loadedPriceLarge;
        }

        } else if (loaded == 4) {


        } else {
            System.out.println("Invalid Option:");
            return;
        }

            if (age <= 17) {
                discountRate = .10;
                discountLabel = "Student discount (10%)";
            } else if (age >= 65) {
                discountRate = .20;
                discountLabel = "Senior discount (20%)";
            }


            double finalPrice = basePrice * (1 - discountRate);
            System.out.printf("Final Price: $%.2f%n", finalPrice);
            System.out.println("Sandwich Size: " + sizeLabel);
            System.out.println("Applied:" + discountLabel);
            System.out.println("----- THANK YOU -----");
        }

    }
