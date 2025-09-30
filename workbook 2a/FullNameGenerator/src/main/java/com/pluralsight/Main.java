package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");

        System.out.print("First name:");
        String first = sc.nextLine().trim();

        System.out.println("Middle name:");
        String middle = sc.nextLine().trim();

        System.out.printf("Last Name:");
        String last = sc.nextLine().trim();

        System.out.print("Suffix:");
        String suffix = sc.nextLine().trim();

        String full = first
                +(middle.isEmpty() ? "" : " " + middle)
                + " " + last
                + (suffix.isEmpty() ? "" : ", " + suffix);

        System.out.println(" Full name: " + full);
        sc.close();

 }
}

