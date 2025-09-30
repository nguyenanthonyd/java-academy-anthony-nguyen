package com.pluralsight;

import java.util.Scanner;

public class DemoString {

    public static void main(String[] args) {

        String email = "anguyen@my.yearupunited.org";

        if (email.endsWith("yearupunited.org")) {
            System.out.printf("Correct e-mail address");
        } else {
            System.out.println("Wrong one buddy");
        }
    }
        public static void ValidateEmailAddress(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter email:");
            String email = sc.nextLine().toLowerCase();

            if(ValidateEmailAddress(email)) {
                System.out.println("Email is Valid");
            } else {
                System.out.println("Invalid Email");
            }
            }

        public static boolean ValidateEmailAddress(String email){
                return  email.endsWith("@yearup.org");
        }

}
