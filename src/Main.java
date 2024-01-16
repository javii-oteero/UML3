import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Country pais = new Country(1, "Portugal");
        State state = new State(1, "São Paulo", pais);
        Adress adress = new Adress("Rua da Silva", "São Paulo", 12345, state);

        AdressBook book = new AdressBook(1);
        Person person = new Person("João", 123456789, "joaoelmilhor@gmail.com", adress, book);
        Person person2 = new Person("Lucas", 654879654, "lucas@lucas.com", adress, book);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);

        AdressBook book2 = new AdressBook(2, persons);
    }


}
