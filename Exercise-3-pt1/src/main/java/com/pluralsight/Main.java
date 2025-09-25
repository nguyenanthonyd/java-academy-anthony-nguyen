package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Salary without dollars
        // Determining whose salary is greater

        double bobSalary = 40000.00;
        double garySalary = 50000.00;
        double highestSalary = Math.max(bobSalary, garySalary); // Determined salary using mathmax


        System.out.println("The highest salary is:");
        System.out.println("Bob's Salary:$" + bobSalary);
        System.out.println("Gary's Salary:$"+ garySalary);
        System.out.println("The highest Salary is:$" + highestSalary);

 // results

    }
}