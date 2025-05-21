import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Boolean isWorkingStay;
    private List<Room> listRoom = new ArrayList<>();
    private List<Guest> listGuest = new ArrayList<>();

    public Booking(Room room, Guest guest, LocalDateTime checkIn, LocalDateTime checkOut, Boolean isWorkingStay, List<Room> listRoom, List<Guest> listGuest) {
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isWorkingStay = isWorkingStay;
        this.listRoom = listRoom;
        this.listGuest = listGuest;
    }

    public void addGuest(Guest newGuest) {
        listGuest.add(newGuest);
    }

    public void removeGuest(Guest newGuest) {
        listGuest.remove(newGuest);
    }

    public void addRoom(Room newRoom) {
        listRoom.add(newRoom);
    }

    public void removeRoom(Room newRoom) {
        listRoom.remove(newRoom);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
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

    public List<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(List<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public List<Guest> getListGuest() {
        return listGuest;
    }

    public void setListGuest(List<Guest> listGuest) {
        this.listGuest = listGuest;
    }
}









