package hotelguest;

public class Guest {
    private int assignRoom;
    private String name;
    public  void requestTowels() {
        System.out.println("Call front desk");
    }

    public int getAssignRoom() {
        return assignRoom;
    }

    public void setAssignRoom(int assignRoom) {
        this.assignRoom = assignRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
