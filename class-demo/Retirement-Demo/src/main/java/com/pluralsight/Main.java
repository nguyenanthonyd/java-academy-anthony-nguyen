package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Retirement Age Demo

        int currentAge = 28;
        int retirementAge = 65;
        yearsToWork(currentAge, retirementAge); // 1st method

        yearsUntilRetirement (currentAge); // 2nd method for

        // two different methods for reference purposes
    }

    public static void yearsToWork(int currentAge, int retirementAge) {
        int yearsLeft = retirementAge - currentAge;

        if (yearsLeft > 0) {
            System.out.println(" Need " + yearsLeft + " more years to work.");

        } else {
            System.out.println("You retired");
        }
    }

    // Second method starts here :

    public static void yearsUntilRetirement( int currentAge) {
                System.out.println("Years left until retirement: " + (65 - currentAge));
            }

    }
