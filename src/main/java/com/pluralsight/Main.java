package com.pluralsight;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String faveColor = "black";
       String startedClass = " 2025";
        String middleInitial  = " D";
       boolean hasPet  = true;
       String message = "I love my pet dog Teddy!";

        System.out.println("My fave color is " + faveColor + ".");
        System.out.println("I started this class in" + startedClass + "!" );
        System.out.println("My middle intial starts with a letter" +  middleInitial + ".");
         if (hasPet)
         {
             System.out.println(message);
         }
    }
}