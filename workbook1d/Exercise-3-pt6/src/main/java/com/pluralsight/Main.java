package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //6. Find and display the absolute (positive) value of a variable after it is set to -3.8

        double number = -3.8;
        double absoluteValue = Math.abs(number); // absolute value formula

        System.out.println("The absolute value of " + number + " is " + absoluteValue);

    }
}