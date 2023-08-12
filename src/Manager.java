class Manager extends Employee {
    int daysTravelled;
    int newClients;

    public Manager(String name, int birthYear, double monthlyIncome, int daysTravelled, int newClients) {
        super(name, birthYear, monthlyIncome, 100);
        this.daysTravelled = daysTravelled;
        this.newClients = newClients;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + name + " has an Occupation rate: " + occupationRate + "% " +
                "He/She travelled " + daysTravelled + " days and has brought " + newClients + " new clients.\n" +
                "His/Her estimated annual income is " + String.format("%.2f", getEstimatedAnnualIncome());
    }

    double getEstimatedAnnualIncome() {
        return monthlyIncome * (12 - (daysTravelled / 20.0)) * (occupationRate / 100.0);
    }
}