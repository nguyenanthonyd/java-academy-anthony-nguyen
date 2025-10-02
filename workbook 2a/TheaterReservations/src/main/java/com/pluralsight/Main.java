package com.pluralsight;
import  java.util.Scanner;
import  java.time.LocalDate;
import  java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for name
        System.out.println("Please enter your name:");
        String fullName= sc.nextLine();

        // Step 2: Ask for date
        System.out.print("What date will you be coming (MM/dd/yyyy):");
        String dateInput = sc.nextLine();
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate showDate = LocalDate.parse(dateInput, inputFormat);

        // Step 3: Ask for tickets
        System.out.print("How many tickets would you like?");
        int tickets = sc.nextInt();

        // Step 4: Format the name
        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[parts.length -1];

        // Step 5: Confirmation message
        String ticketWord = (tickets == 1) ? "ticket" : "tickets";
        System.out.println(tickets + " "  + ticketWord +
                        " reserved for " + showDate + " under " + lastName + ", " + firstName);

        sc.close();
}

}


