package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String movieTitle = "Pokemon the Movie 2000";
        System.out.println("=== Strings ===");
        System.out.println("" + movieTitle);
        System.out.println("Uppercase: " + movieTitle.toUpperCase());


// While loop
        System.out.println("\nPassword is incorrect:");
        Scanner read = new Scanner(System.in);

        boolean passwordIncorrect;
        String password = "1234";
        String enterPassword =" ";

        while (true) {
            System.out.println("What is the password?");

            enterPassword = read.nextLine();

                if (enterPassword.equals(password)) {

                System.out.println("correct");
                break; // exit loop when correct

            } else {
                System.out.println("incorrect");

                }
        }



        System.out.println("\nDo-while loop example:");
        int x = 0;
                do {
                    System.out.println(" x is:" + x);
                    x++;
                }while (x < 3);
                }
    }

