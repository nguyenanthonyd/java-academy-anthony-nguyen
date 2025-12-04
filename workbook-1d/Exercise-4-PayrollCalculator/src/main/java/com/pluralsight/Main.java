import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exercise 4: Step 1

        Scanner sc = new Scanner(System.in);

        // Get user input

        System.out.print("Employer Name:");
        String name = sc.nextLine();

        System.out.print("Hours worked:");
        double hoursWorked = sc.nextDouble();

        System.out.print("Pay Rate:");
        double payRate = sc.nextDouble();

// Calculate their gross pay.

        double grossPay = hoursWorked * payRate;
        System.out.println("Employers Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);




    }
}