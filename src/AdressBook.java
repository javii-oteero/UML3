import java.util.ArrayList;

public class AdressBook {
    private int code;
    private ArrayList<Person> persons;

    public AdressBook(int code) {
        this.code = code;
    }

    public AdressBook(int code, ArrayList<Person> persons) {
        this.code = code;
        this.persons = persons;
    }
}
