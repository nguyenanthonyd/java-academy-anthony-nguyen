package com.pluralsight;

public class  Moped extends Vehicle{
    @Override
    public String drive() {
        System.out.println("Driving on 4 wheels...");
        return "Car is driving with speed!";
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the car with gas.");
    }

    @Override
    public void park() {
        System.out.println("Car is parked.");
    }

    @Override
    public void reverse() {
        System.out.println("Car is reversing.");
    }

    @Override
    public void brake() {
        System.out.println("Applying car brakes.");
    }
}

/*
- color
-fuel capacity
-cargo capacity
- top speed
- drive
- refuel
- park
- reverse
- brake
- 2-3 wheels
 */