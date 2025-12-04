package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//5. Find and display the distance between the points (5, 10) and (85, 50)


        // Formula: distance = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )

        int x1 = 5, y1 = 10;

        int x2 = 85, y2 =50;

double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2));

        System.out.println( "The distance between the points (5, 10) and (85, 50) " + distance);

        System.out.printf( "Rounded to 2 decimal places: %.2f", distance);






    }
}