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
            if (countOfBookings >= maxBookings) {
                break;
            }
            if (! booking.WorkingStay()) {
                result.add(booking);
                countOfBookings++;
            }
        }
        return result;
    }

    public void printGuestStatistics(){
        int oneGuest = 0, twoGuests = 0, moreGuests = 0;
        for (Booking booking : listOfReservations) {
            switch (booking.getGuestsCount()) {
                case 1:
                    oneGuest++;
                    break;
                case 2:
                    twoGuests++;
                    break;
                default:
                    moreGuests++;
            }
        }
        System.out.println("Počet rezervací s jedním hostem: " + oneGuest);
        System.out.println("Počet rezervací se dvěma hosty: " + twoGuests);
        System.out.println("Počet rezervací s více hosty: " + moreGuests);
    }
}







