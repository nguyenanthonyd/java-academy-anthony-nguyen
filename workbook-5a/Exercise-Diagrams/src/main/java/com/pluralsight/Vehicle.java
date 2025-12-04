package com.pluralsight;

public abstract class Vehicle {
    private String color;
    private int fuelCapacity;
    private int topSpeed;
    private int cargoCapacity;

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public Vehicle setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public Vehicle setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public Vehicle setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    public abstract String drive();
    public abstract void refuel();
    public abstract void park();
    public abstract void reverse();
    public abstract void brake();
}


/* Broad
- Super class
- color
-fuel capacity
-cargo capacity
- top speed
- drive
- refuel
- park
- reverse
- brake
 */