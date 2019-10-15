import java.time.LocalDate;

public class ContractorTest {

    public static void main(String[] args) {

        // Creating two customer address objects.
        Address customerA1 = new Address("BlablaStreet 12", "Top", "Mississippi", 2019);
        Address customerA2 = new Address("BlablaStreet 13", "Kek", "Mississippi", 2019);

        // Creating date objects for the projects.
        LocalDate p1Start = LocalDate.parse("2019-11-03");
        LocalDate p1End = LocalDate.parse("2020-05-29");
        LocalDate p2Start = LocalDate.parse("2025-01-01");
        LocalDate p2End = LocalDate.parse("2099-01-22");

        // Creating two project objects, and entering customer addresses/date objects to the constructors, as well as dates.
        Project p1 = new Project("New house","Michael Michaelson",customerA1, p1Start, p1End);
        Project p2 = new Project("Outdoor light motion","Donald Trump",customerA2, p2Start, p2End);

        // Creating address objects for the workers
        Address workerA1 = new Address("Tullegata 10", "Meh", "Ohio", 2019);
        Address workerA2 = new Address("Tullegata 11", "Muff", "NY", 2018);
        Address workerA3 = new Address("Tullegata 13", "A202", "Meh", "Ohio", 2019);


        // Creating three new worker objects, and sending them to the project object.
        Electrician e = new Electrician("Håkon", "Guttulsrud",workerA1, 1, 10, 260);
        Plumber p = new Plumber("Ada", "Hag",workerA2, 2, 20, 250);
        Carpenter c = new Carpenter("Ulf", "Prins",workerA3, 3, 50, 220);
        p1.addWorker(e);
        p1.addWorker(p);
        p1.addWorker(c);


        // Setting the contractor overhead percentage to 18.
        p1.setPercentage(18);
        p.setAdditionalCost(2000);
        // Printing out all project information.
        System.out.println(p1.printInfo());


        //Creating a new worker for project 2, setting electrician addition cost, adding the worker to the project, and printing out the project information.
        Address workerA4 = new Address("Tullegata 120", "A02", "Oslo", "Oslo", 0560);
        Electrician e2 = new Electrician("Jon", "topKek", workerA4, 4, 10, 260);
        e2.setAdditionalCost(2000);
        p2.addWorker(e2);
        p2.setPercentage(18);
        System.out.println(p2.printInfo());

        //Printing the dates for both projects.
        System.out.println("Project 1 startdate: " + p1.getStart());
        System.out.println("Project 2 startdate: " + p2.getStart());
        System.out.println("Project 1 needs to start first.");
    }
}
