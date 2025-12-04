package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);


        StringBuilder sb = new StringBuilder();



        System.out.print("Full name:");
        String fullName = input.nextLine(); // Appended w/ "\n" so it starts on a fresh line
        sb.append(fullName).append("\n");

        sb.append("Billing Address:\n");

        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();
        sb.append(billingStreet).append("\n");

        System.out.print("Billing City: ");
        String billingCity = input.nextLine();


        System.out.print("Billing State: ");
        String billingState = input.nextLine();
        billingState = billingState.toUpperCase();

        System.out.print("Billing Zip: " );
        String billingZip = input.nextLine();


        sb.append(billingCity).append(", " ).append(billingState).append(" ").append(billingZip).append("\n");



        sb.append("Shipping Address:\n");

        System.out.print("Shipping Street:");
        String shipStreet = input.nextLine();
        sb.append(shipStreet).append("\n");


        System.out.print("Shipping City: ");
        String shipCity = input.nextLine();


        System.out.print("Shipping State: ");
        String shipState = input.nextLine();
        shipState = shipState.toUpperCase();


        System.out.print("Shipping Zip: ");
        String shipZip = input.nextLine();

        sb.append(shipCity).append(", ").append(shipState).append(" ").append(shipZip).append("\n");

        System.out.println(sb.toString());

        input.close();

        if (billingStreet.equals(shipStreet)
            && billingCity.equals(shipCity)
            && billingState.equals(shipState)
            && billingZip.equals(shipZip)) {
            System.out.println("Shipping equals billing");

        } else {
            System.out.println("Shipping differs from billing");
        }
    }
}

