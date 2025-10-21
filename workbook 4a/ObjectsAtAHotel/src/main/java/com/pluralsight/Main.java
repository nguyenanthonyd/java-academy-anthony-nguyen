package com.pluralsight;
import hotelservice.FrontDesk;
import hotelguest.Guest;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Guest guest = new Guest("Anthony");
        FrontDesk frontDesk = new FrontDesk();
        frontDesk.checkInGuest(guest);

    }

    }
