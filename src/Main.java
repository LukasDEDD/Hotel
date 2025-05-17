import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Guest>actualGuest= new ArrayList<>();

        Guest adelaMalikova
                = new Guest("Adela", "Malikova", LocalDate.of(1993,3,3));


        Guest janDvoracek
                = new Guest("Jan", "Dvoracek", LocalDate.of(1995,5,5));

        janDvoracek.setBirthDate(LocalDate.of(1995,4,5));

        actualGuest.add(adelaMalikova);
        actualGuest.add(janDvoracek);


        List<Room>occupiedRooms= new ArrayList<>();

        Room room1=
                new Room(1,true,1,true,1000);

        Room room2=
                new Room(2,true,1,true,1000);

        Room room3 =
                new Room(3,false,3,true,2400);

        occupiedRooms.add(room1);
        occupiedRooms.add(room2);
        occupiedRooms.add(room3);

        Room reservationRoom1 = new Room(1, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26));

        room1.addGuest(adelaMalikova);

        Room reservationRoom3 = new Room(3, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));

        room3.addGuest(adelaMalikova,janDvoracek);

        List <Room> otherGuests=new ArrayList<>();
             otherGuests.add(reservationRoom1);
             otherGuests.add(reservationRoom3);

        }

    }
