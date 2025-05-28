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
            if (booking.WorkingStay()) {
                count++;
            }

        }
        return count;
    }
    public double getAverageGuests () {
        double sum  = 0;
        for (Booking booking : listOfReservations) {
            sum += booking.getGuestsCount();
        }
        return sum/listOfReservations.size();
    }
    public List<Booking> getTopNHolidayBookings(int bookingsCount) {
        int countOfBookings = 0;
        List<Booking> result = new ArrayList<>();
        int maxBookings = Math.min(bookingsCount, 8);
        for (Booking booking : listOfReservations) {
            if (countOfBookings >= bookingsCount) {
                break;
            }
            if (! booking.WorkingStay()) {
                result.add(booking);
                countOfBookings++;
            }
        }
        return result;
    }



    }



