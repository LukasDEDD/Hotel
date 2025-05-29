import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Boolean WorkingStay;
    private List<Room> listRoom = new ArrayList<>();
    private List<Guest> listGuest = new ArrayList<>();
    private List <Main> bookingList = new ArrayList<>();

    public Booking(List<Main> bookingList) {
        this.bookingList = bookingList;
    }

    public Booking(Room room, Guest guest, LocalDate checkIn, LocalDate checkOut, Boolean isWorkingStay) {
        this.room = room;
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.WorkingStay = isWorkingStay;

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

    public Boolean WorkingStay() {
        return WorkingStay;
    }

    public void setWorkingStay(Boolean workingStay) {
        WorkingStay = workingStay;
    }

    public List<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(List<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public List<Main> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Main> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Guest> getListGuest() {
        return listGuest;
    }

    public void setListGuest(List<Guest> listGuest) {
        this.listGuest = listGuest;
    }

    public List<Guest> addListGuest() {
        return listGuest;
    }

    public List<Guest> removeListGuest() {
        return listGuest;
    }

    public int getGuestsCount() {
        return listGuest.size() + 1;
    }

        public String getBookingDescription () {
            StringBuilder result = new StringBuilder("Rezervace pro: " + guest.getDescription() + " na: " + room.getRoomNumber()
                    + " termín: " + checkIn + " - " + checkOut
                    + " pracovní pobyt: " + (WorkingStay ? "ano" : "ne"));
            if (!listGuest.isEmpty()) {
                result.append(", další hosté: \n");
                for (Guest guest : listGuest) {
                    result.append(guest.getDescription()).append("\n");
                }
            }
            return result.toString();
        }


    public int getBookingLength() {
        return checkIn.until(checkOut).getDays();
    }

    public BigDecimal getTotalPrice() {
        return room.getPrice().multiply(BigDecimal.valueOf(getBookingLength()));
    }

    public String getFormattedSummary() {
        Guest guest = getGuest();
        return  getCheckIn()+" až "+getCheckOut()+": "+guest.getName()+" "+guest.getSurname()+
                " ("+ guest.getBirthDate()+")["+
                (getListGuest().size()+1)+", "+(getRoom().getSeaView()?"ano":"ne")+"] za "+getTotalPrice()+" Kč";
    }
}








