public class Carpenter extends Worker {


    Carpenter (String fName, String lName, Address address, int idNumber, double hours, double rate) {
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void doWork() {
        System.out.println("Doing work!");
    }
}
