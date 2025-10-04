package com.pluralsight;

public class VehicleInventory {
    public static void main (String[] args) {
        // 1. Array that can hold up to 20 vehicles
        Vehicle[] vehicles = new Vehicle[20];
        int vehicleCount = 6; // start with 6 preloaded // d

        // 2.Preload array with 6 vehicles
        vehicles[0] = new Vehicle(101121, "Mazda RX-7", "White", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Supra","Black", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Nissan Skyline R-34","Blue", 5000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic Type - R", "Yellow"