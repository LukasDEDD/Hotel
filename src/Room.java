import java.time.LocalDateTime;

public class Room {

    private int roomNumber;
    private int numberOfBeds;
    private Boolean balcony;
    private Boolean seaView;
    private double price;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Boolean isWorkingStay;

    public Room(int roomNumber, Boolean balcony, int numberOfBeds, Boolean seaView, double price, LocalDateTime checkOut, LocalDateTime checkIn, Boolean isWorkingStay) {
        this.roomNumber = roomNumber;
        this.balcony = balcony;
        this.numberOfBeds = numberOfBeds;
        this.seaView = seaView;
        this.price = price;
        this.checkOut = checkOut;
        this.checkIn = checkIn;
        this.isWorkingStay = isWorkingStay;


    }

    public Room(int roomNumber, boolean balcony, int numberOfBeds, boolean seaView, int price) {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public Boolean getSeaView() {
        return seaView;
    }

    public void setSeaView(Boolean seaView) {
        this.seaView = seaView;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Boolean getWorkingStay() {
        return isWorkingStay;
    }

    public void setWorkingStay(Boolean workingStay) {
        isWorkingStay = workingStay;
    }
}
