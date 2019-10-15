public class Address {

    private String street1, street2, city, state;
    private int zip;

    Address(String street1, String city, String state, int zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    Address(String street1, String street2, String city, String state, int zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String print() {
        return "Street 1: " + street1 + ". Street 2: " + street2 + ". City: " + city + ". State: " + state + ". ZIP: " + zip;
    }

    public String print2() {
        return "Street 1: " + street1 + ". City: " + city + ". State: " + state + ". ZIP: " + zip;
    }


}
