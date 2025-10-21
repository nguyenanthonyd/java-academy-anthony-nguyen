package com.pluralsight;
import hotelservice.Employee;
import hotelservice.FrontDesk;
import hotelguest.Guest;
import hotelservice.Reservation;
import hotelservice.Room;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Room r1 = new Room(2, 139.99, false, false);
                System.out.println(r1.isAvailable());

                Reservation res = new Reservation("king", 3, true);
                System.out.println(res.getReservationTotal());

                Employee emp = new Employee(101, "Sarah", "Housekeeping", 18.50, 45);
                System.out.println(emp.getTotalPay());
            }
        }

    }
