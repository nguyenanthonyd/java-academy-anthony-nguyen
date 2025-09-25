package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int daysInWeek = 7;
float priceOfCoffee = 4.99f;
char faveLetter = 'A' ;
boolean isRaining = true;

        System.out.println("There are " + daysInWeek + " days in a week. ");
        System.out.println("Coffee costs " +  "$" + priceOfCoffee + " on every one of those days." );
        System.out.println("The coffee I get is labeled the letter " + faveLetter + " on the menu.");

        if (isRaining) {
            System.out.println("It's not raining today, so I can buy some coffee!");
        }
else
            System.out.println("Can't go!");

        }


    }
