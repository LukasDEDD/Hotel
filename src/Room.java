import java.time.LocalDate;
import java.time.LocalDateTime;

public class Room {

    private Integer roomNumber;
    private Integer numberOfBeds;
    private Boolean balcony;
    private Boolean seaView;
    private double price;



    public Room(Integer numberOfBeds, Boolean balcony, Integer roomNumber, Boolean seaView, double price) {
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.roomNumber = roomNumber;
        this.seaView = seaView;
        this.price = price;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
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

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", numberOfBeds=" + numberOfBeds +
                ", balcony=" + balcony +
                ", seaView=" + seaView +
                ", price=" + price +
                '}';
    }


    }








