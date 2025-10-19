package com.pluralsight;
import  java.io.*;
import  java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file employee file to process:");
        String employeeFile = scanner.nextLine().trim();

        System.out.println("Enter the name of the payroll file to create: ");
        String payrollFile = scanner.nextLine().trim();

        try (BufferedReader reader = new BufferedReader(new FileReader(employeeFile));
             PrintWriter writer = new PrintWriter(new FileWriter(payrollFile))) {

            String line;

            writer.println("id|name|gross pay");

            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;

                String[] index = line.split(",", -1);
                if (index.length < 4) {
                    System.out.println("Skipping malformed line: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(index[0]);
                    String name = index[1];
                    double rate = Double.parseDouble(index[2]);
                    double hours= Double.parseDouble(index[3]);

                    Employee employee = new Employee(id, name, hours, rate);
                    double gross = employee.getGrossPay();

                    System.out.printf("Employee: %s | Gross Pay: $%.2f\n", name, gross);

                    writer.printf("%d|%s|%.2f%n", id, name, gross);


                } catch (NumberFormatException nfe) {
                    System.out.println("Bad number in input: " + nfe.getMessage() + "on line -> " + line);
                }
            }
            System.out.println("Open" + payrollFile + " to verify.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
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
