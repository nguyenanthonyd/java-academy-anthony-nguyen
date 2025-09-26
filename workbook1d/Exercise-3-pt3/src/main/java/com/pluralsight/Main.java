package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Question 3
// Finding area of a circle
// Given the radius is 7.25
// // Formula: area = π × r^2



        double radius = 7.25;
        double area = Math.PI * radius* radius; // can do Math.PI* Math.pow(radius, 2)

        System.out.println("Given radius: " + radius);
        System.out.println( "Formula : area =  π × r^2");
        System.out.println( "Computed area (square units): "+ area);
        System.out.printf("Area (rounded to 2 decimals): %.2f square units%n",area);

    }
}