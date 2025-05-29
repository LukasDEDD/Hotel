import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Room {

    private Integer roomNumber;
    private Integer capacity;
    private Boolean balcony;
    private Boolean seaView;
    private BigDecimal price;

    public Room(Integer roomNumber, Integer capacity, Boolean balcony, Boolean seaView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.balcony = balcony;
        this.seaView = seaView;
        this.price = price;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRoomDescription () {
            String description = "Pokoj číslo: " + roomNumber + ": " + capacity + " lůžka, balkón: ";
            if (balcony) {
                description += "ano";
            } else {
                description += "ne";
            }
            description += ", výhled na moře: ";
            if (seaView) {
                description += "ano";
            } else {
                description += "ne";
            }
            description += ", cena za noc: " + price + " Kč";
            return description;
        }
    }













