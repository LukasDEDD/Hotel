import java.time.LocalDate;
import java.time.LocalDateTime;
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
                new Room(1,true,1,true,1000);

        occupiedRooms.add(room1);
        occupiedRooms.add(room2);
        }
    }
