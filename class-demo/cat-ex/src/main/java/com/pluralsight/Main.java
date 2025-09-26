package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Cat - Exercise in class demo

        String catName="meowmeow"; // cat name

        int catAge = 9; // whole number

        double catWeight = 4.5; // decimal number

        char catGrade = 'B'; // single characters

        String catColor = "Black";  // cat color

        boolean isHungry = true; //true/false

        boolean isSleeping =true;


        System.out.println("Meet" + catName + "!");

        System.out.println("Age:" + catAge);

        System.out.println("Weight:" + catWeight + "kg");

        System.out.println("Hungry?" +isHungry);

        if (isSleeping)

            System.out.println("The " +  catColor + " cat is sleeping");

    }

}