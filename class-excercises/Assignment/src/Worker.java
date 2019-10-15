public class Worker {

    // Instance variables
    private String fname, lname;
    private double hours, rate;
    private Address address;
    private int idNumber;


    // Constructor
    public Worker(String fName, String lName, Address address, int idNumber, double hours, double rate) {
        this.fname = fName;
        this.lname = lName;
        this.address = address;
        this.idNumber = idNumber;
        this.hours = hours;
        this.rate = rate;
    }

    public void doWork(){
        System.out.println("Doing generic work!");
    }

    public double getRate() {
        return rate * hours;
    }

    public String toString() {
        return "ID: "+ idNumber + ". Occupation: " + this.getClass().getName() + ". Name: " + fname + " " + lname + ". " + address.print() + "\n";
    }
}
