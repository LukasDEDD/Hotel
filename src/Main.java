import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        BookingManager manager = new BookingManager();
        fillBookings(manager);

        testCode(manager);
    }


    private static void fillBookings(BookingManager manager) {

        Guest adelaMalikova
                = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 3));


        Guest janDvoracek
                = new Guest("Jan", "Dvoracek", LocalDate.of(1995, 5, 5));

        Guest karolinaVelka
                = new Guest( "Karolina", "Velka", LocalDate.of(1985,4,18));



        List<Room> occupiedRooms = new ArrayList<>();

        Room room1 =
                new Room(1, 1, true, true, BigDecimal.valueOf(150.4));

        Room room2 =
                new Room(2, 1, true, true, BigDecimal.valueOf(1583.52));

        Room room3 =
                new Room(3, 3, false, true, BigDecimal.valueOf(2593.65));

        occupiedRooms.add(room1);
        occupiedRooms.add(room2);
        occupiedRooms.add(room3);

        Booking booking1 = new Booking(
                room1, adelaMalikova, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(
                room3, adelaMalikova, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), false);
        Booking booking3 = new Booking( room3, karolinaVelka,LocalDate.of(2023,8,1), LocalDate.of(2023, 8, 31),false);
        booking2.addGuest(janDvoracek);

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);

        for (int i = 1; i < 20; i += 2) {
            manager.addBooking(new Booking(
                    room2, karolinaVelka, LocalDate.of(2023, 8, i),
                    LocalDate.of(2023, 8, (i+1)), false));
        }
    }

    private static void testCode(BookingManager manager) {
        System.out.println("Počet pracovních pobytů: " + manager.getNumberOfWorkingBookings());
        System.out.println("\nPrůměrný počet hostů na rezervaci: " + manager.getAverageGuests());
        System.out.println("\nPrvních osm rekreačních rezervací:");
        manager.getTopNHolidayBookings(8).forEach(booking -> System.out.println(booking.getBookingDescription()));
        System.out.println("\nStatistiky hostů:");
        manager.printGuestStatistics();
        System.out.println("\nPočet pracovních pobytů: " + manager.getNumberOfWorkingBookings());

        System.out.println("\nFormátovaný výpis všech rezervací v systému:");
        for (Booking booking : manager.getListOfReservatoins()) {
            System.out.println(booking.getFormattedSummary());
        }
    }
}