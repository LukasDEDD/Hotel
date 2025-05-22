import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Guest> actualGuest = new ArrayList<>();

        Guest adelaMalikova
                = new Guest("Adela", "Malikova", LocalDate.of(1993, 3, 3));


        Guest janDvoracek
                = new Guest("Jan", "Dvoracek", LocalDate.of(1995, 5, 5));

        janDvoracek.setBirthDate(LocalDate.of(1995, 4, 5));

        actualGuest.add(adelaMalikova);
        actualGuest.add(janDvoracek);


        List<Room> occupiedRooms = new ArrayList<>();

        Room room1 =
                new Room(1, 1, true, true, 1000);

        Room room2 =
                new Room(2, 1, true, true, 1000);

        Room room3 =
                new Room(3, 3, false, true, 2400);

        occupiedRooms.add(room1);
        occupiedRooms.add(room2);
        occupiedRooms.add(room3);

        Booking booking1 = new Booking(room1, adelaMalikova, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(room3, adelaMalikova, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), false);
        booking2.addGuest(janDvoracek);

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("Výpis všech rezervací v systému:");
        for (Booking booking : bookingList) {
            System.out.println(booking.getBookingDescription());

        }

    }
}
