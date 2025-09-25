package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    String movieTitle = "Pokemon The Movie 2000";

    int numberOfFriends = 2; // not including me

    double pricePerPizza = 4.99; // without dollar sign

    boolean havePopcorn = false;

    double pizzaCost = pricePerPizza *(numberOfFriends +1); // +1 I am also eating

        System.out.println(" We're watching " + movieTitle + " with " + numberOfFriends + " friends!");

        System.out.println(" Pizza costs $" + pricePerPizza + " each.");

        System.out.println(" That's going to be $" + pizzaCost + " in total so far.");

        if (havePopcorn ) {
            System.out.println(" Popcorn time!");
        }
        else {
            System.out.println(" No money for popcorn? Too bad for you!");
        }
        }

}