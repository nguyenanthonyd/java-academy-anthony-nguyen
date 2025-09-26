package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hi("Goku"); // Call the function


        IncreasePowerLevel(9000);

        DoubleAge(1);
    }

    public static void Hi(String name) {
        System.out.println("Vegeta, what does the scouter say about his power level?" + name);

    } // Powers up out of anger
    public static int IncreasePowerLevel (int powerlevel) {
        System.out.println("It's over " + powerlevel + "!!!!!!!!!!");
        return powerlevel;
    }
    // Time spent in Hyperbolic Time Chamber
        public static void DoubleAge (int age) {
            int doubled = age * 2;
            System.out.println("The power exceeds Kaio-Ken" + " x"+ doubled);
    }

}