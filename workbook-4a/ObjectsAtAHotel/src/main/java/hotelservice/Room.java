package hotelservice;

public class Room {
    // Fields (What the room knows)
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor ( sets initial values/ holds variables)
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public void checkIn() {
        occupied = false;
        dirty = true;
        System.out.println("Guest checked in.");
    }

    public void checkOut() {
        occupied = false;
        dirty = true;
        System.out.println("Guest checked out. Room needs cleaning.");
    }

    public void cleanRoom() {
        occupied = false;
        dirty = false;
        System.out.println(" Room has been cleaned and is ready.");
    }
}





