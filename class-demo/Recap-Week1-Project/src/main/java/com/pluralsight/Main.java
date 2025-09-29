package com.pluralsight;



import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter exam score (0-100):");
        int examScore = sc.nextInt(); // Stores input into a variable. Input examscore

        char grade; // Used char because of letter grade

        if (examScore >= 90 && examScore <= 100) {
            grade = 'A';

        }else if (examScore >= 80) {
            grade = 'B';

        }else if (examScore >= 70) {
            grade = 'C';

        } else if (examScore >= 60) {
            grade = 'D';

        } else {
                grade = 'F';
        }


            System.out.println("Your grade: " + grade);

        }

}