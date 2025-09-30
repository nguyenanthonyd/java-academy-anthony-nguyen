package com.pluralsight;
import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. FOR LOOP
        // Use when you know how many times you want to repeat
        System.out.println("For Loop: Counting from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("even number:" + i);

            } else {
                System.out.println("odd number:" + i);
            }
        }

        // 2. WHILE LOOP
        // Use when you don't know how many times in advance
        System.out.println("\nWhile Loop: Counting down from 5");
        int j = 5;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            j--;
        }
            // 3. DO...WHILE LOOP
            // Always runs at least once, even if condition is false
            String enter ;
            do {
                System.out.println("Enter whatever( exit to terminate):");
                ;
                enter = scanner.nextLine().trim();


            } while (!enter.equalsIgnoreCase("exit"));
        }
    }

