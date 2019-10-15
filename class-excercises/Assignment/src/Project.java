import java.time.LocalDate;
import java.util.ArrayList;

public class Project {

    private String projectName, customer, projectAddress;
    private ArrayList<Worker> workers = new ArrayList<>();
    private double estimatedCost, percentage;
    private LocalDate start, end;

    public Project(String projectName, String customer, Address projectAddress, LocalDate startTime, LocalDate endTime) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress.print2();
        this.start = startTime;
        this.end = endTime;
        this.start = startTime;
        this.end = endTime;
    }

    public Project(String projectName, String customer, Address projectAddress) {
        this.projectName = projectName;
        this.customer = customer;
        this.projectAddress = projectAddress.print2();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public LocalDate getStart() {
        return start;
    }

    public void setPercentage(double percentage) {
        this.percentage = (percentage/100 + 1);
    }

    public double getEstimatedCost() {
        for (Worker worker : workers) {
            estimatedCost += worker.getRate();
        } return estimatedCost * percentage;
    }


    public String printInfo() {
        String info =  "\nProject name: " + projectName + "\nProject address: " + projectAddress + "." +
                "\nCost: " + getEstimatedCost() + ",-" +
                "\nProject start date: " + start + ". Project end date: " + end + "" +
                "\n\nWorkers: \n";
        for (Worker worker : workers) {
            info += worker.toString();
        } return info;
    }
}
