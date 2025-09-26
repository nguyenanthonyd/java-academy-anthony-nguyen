package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Find and display the square root a variable after it is set to 5.0

        double number = 5.0;
        double squareRoot = Math.sqrt(number); // this is to calculate square root

        System.out.println(" The square root of " + number + " is " + squareRoot);
        System.out.printf(" Rounded 2 decimal places: %.2f", squareRoot);

// rounded two decimal places
}


}