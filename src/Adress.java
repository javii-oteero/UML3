public class Adress {
    private String street;
    private String city;
    private int postalCode;
    private State state;
    private Person person;

    public Adress(String street, String city, int postalCode, State state, Person person) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
        this.person = person;
    }

    public Adress(String street, String city, int postalCode, State state) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.state = state;
    }

}
