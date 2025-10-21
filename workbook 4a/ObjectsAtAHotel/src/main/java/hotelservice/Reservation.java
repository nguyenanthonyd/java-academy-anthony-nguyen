package hotelservice;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    //Constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    // derived getter : calculates price per night
    public double getPrice() {
        double basePrice = 0;

        if(roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124.00;
        }
        if (isWeekend) {
            basePrice *= 1.10;
        }
        return basePrice;

}
public double getReservationTotal() {
    return getPrice() * numberOfNights;
}
}