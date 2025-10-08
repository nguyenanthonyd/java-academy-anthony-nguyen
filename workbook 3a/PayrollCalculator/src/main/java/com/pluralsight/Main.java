package com.pluralsight;
import  java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));
            String line;



            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hours = Double.parseDouble(tokens[2]);
                double rate = Double.parseDouble(tokens[3]);

                Employee emp = new Employee(id, name, hours, rate);
                System.out.printf("Employee: %s | Gross Pay: $%.2f\n", emp.getName(), emp.getGrossPay());


            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}

