package com.pluralsight;

public class Employee {
    private int employeeId;
    private  String name;
    private double hoursworked;
    private double payRate;

    public Employee(int employeeId, String name , double hoursworked, double payRate) {
        // Initialize variables here
        this.employeeId = employeeId;
        this.name = name;
        this.hoursworked = hoursworked;
        this.payRate = payRate;

    }
// Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursworked(double hoursworked) {
        this.hoursworked = hoursworked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public double getHoursworked() {
        return hoursworked;
    }

    public double getPayRate() {
        return payRate;
    }


    public double getGrossPay() {
        double grossPay;
        if (hoursworked <= 40) {
            grossPay = hoursworked * payRate;
        } else {
            double overtimeHours = hoursworked - 40;
            grossPay = (40 * payRate) + (overtimeHours * payRate * 1.5);
        }
        return grossPay;
        }





}





