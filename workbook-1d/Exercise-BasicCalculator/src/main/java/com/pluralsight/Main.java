package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // Basic Calculator Exercise
        // Multiply for this Exercise


        // Step 1:  Perform the requested operation and display the results.




        Scanner sc = new Scanner(System.in); // Multiplying calculations

        System.out.print("Enter the first number:" );
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number");
        double number2 = sc.nextDouble();

        // Multiply
        System.out.println("(M)ultiply");
        System.out.println("Select an option:");
        String choice =sc.next();

        double result = number1 * number2;
        System.out.println( number1 +  " * " +  number2 + "=" + result);




    }
}