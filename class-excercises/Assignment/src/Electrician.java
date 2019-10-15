public class Electrician extends Worker {

    private double additionalCost;

    public Electrician(String fName, String lName, Address address, int idNumber, double hours, double rate) {
        super(fName, lName, address, idNumber, hours, rate);
    }

    @Override
    public double getRate() {
        return super.getRate() + additionalCost;
    }

    public void setAdditionalCost(double additionalCost) {
        this.additionalCost = additionalCost;
    }

    public void doWork() {
        System.out.println("Doing work!");
    }
}
