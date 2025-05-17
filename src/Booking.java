import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private List otherGuests;

    public Booking(Room room, Guest guest, List otherGuests) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
    }

    public void addGuest(Guest guest) {otherGuests.add(guest)
        ;} // potrebuji tento konstruktor?? kdyz ve tride Room mam podobny, bez ktereho se me hlasi chyba

    public void removeGuest(Guest guest) {
        otherGuests.remove(guest);
    }       // potrebuji tento konstruktor?? kdyz ve tride Room mam podobny, bez ktereho se me hlasi chyba

    public List<Guest> getotherGuests() {

        return new ArrayList<>(otherGuests);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuests() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List otherGuests) {
        this.otherGuests = otherGuests;
    }
}
