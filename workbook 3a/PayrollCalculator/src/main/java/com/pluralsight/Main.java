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

//Exercises — Payroll Calculator Pt. 2
//EXERCISE 1
//Continue working on the PayrollCalculator program.
//Rather than displaying your payroll report to the screen, write it to a .csv file in
//the following format.
//id|name|gross pay
//111|Cameron Tay|3277.65
//222|James Tee|2150.00
//Prompt the user for the name of a file to read and process, then prompt them for
//the name of the payroll file to create.
//Enter the name of the file employee file to process: employees.csv
//Enter the name of the payroll file to create: payroll-sept-2023.csv
//When your program finishes running, open the new file to view the results.
//BONUS: If the user chooses specifies a .json extension write the data as JSON
//instead of csv.
//For example:
//Enter the name of the file employee file to process: employees.csv
//Enter the name of the payroll file to create: payroll-sept-2023.json
//payroll-sept-2023.json
//[
//{ "id": 111, "name" : "Cameron Tay", "grossPay" : 3277.65 },
//{ "id": 222, "name" : "James Tee", "grossPay" : 2150.00 }
//]
//1. Ensure all your changes are committed and pushed to GitHub
//2. Let your Instructor know you’ve completed this exercise
