package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // variables for Exercise 2 pt3

        String item = "apple";

        int apples = 3; // amount

        double itemPrice = 2.3666666667; // price per apple

        double costOfAllApples = itemPrice*(apples); // cost of all 3 apples

        System.out.println("You bought 3 apples for $" + costOfAllApples); // first example

        System.out.printf("You bought %d %ss for $%.2f%n", apples, item, costOfAllApples); // revised with chatgpt


        // %d = integer ( amount of apples)
        // %s = string  ( String item = apple, extra s for plural
        // %.2f in printf makes sure the money is rounded to two decimal places.
        // %n adds a new line at the end.

    }
}