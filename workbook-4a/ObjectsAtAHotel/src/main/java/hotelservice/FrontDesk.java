package hotelservice;

import hotelguest.Guest;

public class FrontDesk {
    public void checkInGuest(Guest guest) {
        System.out.println("Welcome," + guest.getName() + "!");
        assignRoom(guest);
        giveKey(guest);

    }

    public void assignRoom(Guest guest) {
        System.out.println("Assigning room");


    }

    public void giveKey(Guest guest) {
        System.out.println("Here is your room key," + guest.getName());
    }
}
