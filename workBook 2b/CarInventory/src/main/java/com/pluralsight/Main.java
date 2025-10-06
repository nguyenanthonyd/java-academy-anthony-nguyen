package com.pluralsight;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle( 1, "Tesla Model Y", "White", 5, 400, 75, "5YJGDEE8MF123456");
        System.out.println(car);
        System.out.println("Fuel capacity: " + car.getFuelCapacity() + " L");

    }
}