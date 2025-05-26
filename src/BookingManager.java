import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> listOfReservations = new ArrayList<>();

    public void addBooking(Booking booking) {
        listOfReservations.add(booking);
    }

    public Booking getBooking(int index) {
        return listOfReservations.get(index);
    }

    public List<Booking> getListOfReservatoins() {
        return new ArrayList<>(listOfReservations);
    }

    public void clearBookings() {
        listOfReservations.clear();
    }

    public int getNumberOfWorkingBookings() {
        int count = 0;
        for (Booking booking : listOfReservations) {
            if (booking.getWorkingStay()) {
                count++;
            }
        }
        return count;
    }



}

