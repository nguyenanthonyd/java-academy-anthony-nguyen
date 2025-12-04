package com.pluralsight;

public class CompareNumbers {


    public static void main(String[] args) {
        // TODO: call isEven and isPositive with some test numbers
        System.out.println(isEven(5));     // false
        System.out.println(isEven(10));    // true
        System.out.println(isPositive(3)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-1));// false



    }



    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    public static boolean isPositive(double number) {
        return number > 0;

    }
}
