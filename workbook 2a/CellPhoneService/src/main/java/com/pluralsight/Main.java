package com.pluralsight;

import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    //1. Make a phone object
        CellPhone phone = new CellPhone();



    //2. Prompt user and SET values
        System.out.print("What is the serial number? ");
        int sNum = Integer.parseInt(sc.nextLine()); // nextLine to avoid newline trap
        phone.setSerialNumber(sNum);

        System.out.print("What model is the phone? ");
        String model = sc.nextLine();
        phone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = sc.nextLine();
        phone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String pNum = sc.nextLine();
        phone.setPhoneNumber(pNum);

        System.out.print("Who is the owner of the phone? ");
        String owner = sc.nextLine();
        phone.setOwner(owner);

        System.out.println("\n--- Phone Summary ---");
        System.out.println("Serial #:" + phone.getSerialNumber());
        System.out.println("Model   :" + phone.getModel());
        System.out.println("Carrier :" + phone.getCarrier());
        System.out.println("Number  :" + phone.getPhoneNumber());
        System.out.println("Owner   :" + phone.getOwner());

        sc.close();
    }
}