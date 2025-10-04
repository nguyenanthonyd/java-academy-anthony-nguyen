package com.pluralsight;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Dice dice = new Dice();

 int twoCounter = 0;
 int fourCounter = 0;
 int sixCounter = 0;
 int sevenCounter = 0;

 for (int i = 1; i <= 100; i++) {
     int roll1 = dice.roll();
     int roll2 = dice.roll();
     int sum = roll1 + roll2;

     System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

     if (sum == 2) {
         twoCounter++;
     } else if (sum == 4) {
         fourCounter++;
     } else if (sum == 6) {
         sixCounter++;
     } else if (sum == 7) {


     }

 }

        System.out.println("\n --- Results --- ");
        System.out.println(" Number of 2's:" + twoCounter);
        System.out.println(" Number of 4's:" + fourCounter);
        System.out.println(" Number of 6's:" + sixCounter);
        System.out.println(" Number of 7's " + sevenCounter);

    }
}