package com.pluralsight;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(new Car());
        for (int i = 0; i < vehicles.size() ; i++) {
            vehicles.get(i).drive();
        }
    }
}