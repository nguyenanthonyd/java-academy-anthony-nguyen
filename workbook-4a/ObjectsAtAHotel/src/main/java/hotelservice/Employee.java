package hotelservice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime = 0; // last punch-in; 0 means not "punched in"

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // overloaded punch in
    public void punchIn(double time) {
        if (startTime != 0) {
            System.out.println(name + "already punched in.");
            return;
        }
        startTime = time;
        System.out.println(name + "punched in at" + time);

    }

    public void punchOut(double time) {
        if (startTime == 0) {
            System.out.println(name + "hasn't punched in.");
            return;
        }
        double workedHours = time - startTime;
        if (workedHours < 0) {
            System.out.println("Invalid time. Punch out cannot be earlier than punch in.");
            return;
        }

        hoursWorked += workedHours;
        startTime = 0;
        System.out.println(name + "punched out at" + time + "(worked" + workedHours + "hours)");
    }

    // derived getters
    public double getRegularHours() {
        return Math.min(hoursWorked, 40.0);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40.0, 0.0);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    public void showSummary() {
        System.out.println("\n--- Employee Summary ---");
        System.out.println("Employee: " + name);
        System.out.println("Department: " + department);
        System.out.println("Total hours: " + hoursWorked);
        System.out.println("Regular hours: " + getRegularHours());
        System.out.println("Overtime hours: " + getOvertimeHours());
        System.out.printf("Total pay: $%.2f%n", getTotalPay());
        System.out.println("-------------------------\n");

    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);
        punchIn(currentTime); // calls existing punchIn(double)
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);
        punchOut(currentTime);
    }
}

