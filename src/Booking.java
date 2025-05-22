import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Boolean isWorkingStay;
    private List<Room> listRoom = new ArrayList<>();
    private List<Guest> listGuest = new ArrayList<>();

    public Booking(Room room, Guest guest, LocalDate checkIn, LocalDate checkOut, Boolean isWorkingStay) {
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.isWorkingStay = isWorkingStay;

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

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
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

    public List<Guest> addListGuest() {
        return listGuest;
    }

    public List<Guest> removeListGuest() {
        return listGuest;
    }


        public String getBookingDescription () {
            StringBuilder result = new StringBuilder("Rezervace pro: " + guest.getDescription() + " na: " + room.getRoomNumber()
                    + " termín: " + checkIn + " - " + checkOut
                    + " pracovní pobyt: " + (isWorkingStay ? "ano" : "ne"));
            if (!listGuest.isEmpty()) {
                result.append(", další hosté: \n");
                for (Guest guest : listGuest) {
                    result.append(guest.getDescription()).append("\n");
                }
            }
            return result.toString();
        }
    }








