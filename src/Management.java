import java.util.ArrayList;

public class Management {
    ArrayList<Employee> employees;
    double workingDaysPerMonth;

    public Management() {
        employees = new ArrayList<>();
        workingDaysPerMonth = 20.0;
    }

    void hireTest1() {
        // Part 1 - Employee Initialization
        Manager serge = new Manager("Serge", 1990, 6000, 4, 30);
        Manager cindy = new Manager("Cindy", 1979, 5000, 6, 20);
        Programmer paul = new Programmer("Paul", 1998, 4000, 3);
        Tester pierre = new Tester("Pierre", 1992, 3500, 124);
        Programmer matt = new Programmer("Matt", 1986, 5000, 5);
        Programmer sarah = new Programmer("Sarah", 1991, 3000, 3);

        // Part 2 - Vehicle Initialization
        Car sergeVehicle = new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport");
        serge.setVehicle(sergeVehicle);
        Car cindyVehicle = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan");
        cindy.setVehicle(cindyVehicle);
        Motorcycle paulVehicle = new Motorcycle("Kawasaki", "Custom Plate", "Yellow", "Race Motorcycle", false);
        paul.setVehicle(paulVehicle);
        Motorcycle pierreVehicle = new Motorcycle("Honda", "Custom Plate", "Black", "Not for Race", true);
        pierre.setVehicle(pierreVehicle);
        Car mattVehicle = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV");
        matt.setVehicle(mattVehicle);
        Car sarahVehicle = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
        sarah.setVehicle(sarahVehicle);

        // Part 3 - Contract Initialization
        PermanentContract sergeContract = new PermanentContract(serge, 6000, 2, "married", 450);
        serge.setContract(sergeContract);
        PermanentContract cindyContract = new PermanentContract(cindy, 5000, 3, "single", 350);
        cindy.setContract(cindyContract);
        TemporaryContract paulContract = new TemporaryContract(paul, 60);
        paul.setContract(paulContract);
        PermanentContract pierreContract = new PermanentContract(pierre, 4000, 1, "married", 300);
        pierre.setContract(pierreContract);
        PermanentContract mattContract = new PermanentContract(matt, 5000, 1, "married", 250);
        matt.setContract(mattContract);
        PermanentContract sarahContract = new PermanentContract(sarah, 4500, 4, "married", 200);
        sarah.setContract(sarahContract);

        employees.add(serge);
        employees.add(cindy);
        employees.add(paul);
        employees.add(pierre);
        employees.add(matt);
        employees.add(sarah);
        for (Employee employee: employees){
            System.out.println("We have a new employee: " + employee.name + ", a " + employee.getClass().getSimpleName() + ".");
        }
    }

    void hireTest2() {
        System.out.println("Test 2:");
        System.out.println("Employees description:");
        for (Employee employee: employees){
            System.out.println("We have a new employee: " + employee.name + ", a " + employee.getClass().getSimpleName() + ".");
        }
        System.out.println("-------------------------");
        for (Employee employee : employees) {
            //System.out.println("We have a new employee: " + employee.name + ", a " + employee.getClass().getSimpleName() + ".");

            System.out.println("Name: " + employee.name + ", a " + employee.getClass().getSimpleName());
            System.out.println("Age: " + employee.getAge(2023)); // Moved age information here

            if (employee.vehicle != null) {
                System.out.println(employee.vehicle);
            }
            System.out.println("-------------------------");

            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println(manager.name + " has an Occupation rate: " + manager.occupationRate + "% " +
                        "He/She travelled " + manager.daysTravelled + " days and has brought " + manager.newClients + " new clients.");
                System.out.println("His/Her estimated annual income is " + manager.getEstimatedAnnualIncome());
            } else if (employee instanceof Tester) {
                Tester tester = (Tester) employee;
                System.out.println(tester.name + " has an Occupation rate: " + tester.occupationRate + "% and corrected " +
                        tester.bugsCorrected + " bugs.");
                System.out.println("His/Her estimated annual income is " + tester.getEstimatedAnnualIncome());
            } else if (employee instanceof Programmer) {
                Programmer programmer = (Programmer) employee;
                System.out.println(programmer.name + " has an Occupation rate: " + programmer.occupationRate + "% and completed " +
                        programmer.projectsCompleted + " projects.");
                System.out.println("His/Her estimated annual income is " + programmer.getEstimatedAnnualIncome());
            }
            System.out.println("-------------------------");
        }
    }


    void hireTest3() {
        System.out.println("Test 3:");
        System.out.println("Employees description:");
        for (Employee employee : employees) {
            System.out.println("We have a new employee: " + employee.name + ", a " + employee.getClass().getSimpleName() + ".");
            if (employee.vehicle != null) {
                System.out.println(employee.vehicle);
            }
            System.out.println("-------------------------");
            System.out.println("Name: " + employee.name + ", a " + employee.getClass().getSimpleName());
            System.out.println("Age: " + employee.getAge(2023));

            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println(manager.name + " has an Occupation rate: " + manager.occupationRate + "% " +
                        "He/She travelled " + manager.daysTravelled + " days and has brought " + manager.newClients + " new clients.");
                System.out.println("His/Her estimated annual income is " + manager.getEstimatedAnnualIncome());
            } else if (employee instanceof Tester) {
                Tester tester = (Tester) employee;
                System.out.println(tester.name + " has an Occupation rate: " + tester.occupationRate + "% and corrected " +
                        tester.bugsCorrected + " bugs.");
                System.out.println("His/Her estimated annual income is " + tester.getEstimatedAnnualIncome());
            } else if (employee instanceof Programmer) {
                Programmer programmer = (Programmer) employee;
                System.out.println(programmer.name + " has an Occupation rate: " + programmer.occupationRate + "% and completed " +
                        programmer.projectsCompleted + " projects.");
                System.out.println("His/Her estimated annual income is " + programmer.getEstimatedAnnualIncome());
            }
            System.out.println("-------------------------");
        }
    }
}