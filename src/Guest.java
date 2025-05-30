import java.time.LocalDate;

public class Guest {

    private String name;
    private String surname;
    private LocalDate birthDate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Guest(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;

    }

    public String getDescription() {
        return name + " " + surname + " (" + birthDate + ")";
    }
        @Override
        public String toString() {
            return "Guest{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", birthDate=" + birthDate +
                    '}';

    }
}
