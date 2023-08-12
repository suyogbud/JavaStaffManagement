class Programmer extends Employee {
    int projectsCompleted;

    public Programmer(String name, int birthYear, double monthlyIncome, int projectsCompleted) {
        super(name, birthYear, monthlyIncome, 100);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + name + " has an Occupation rate: " + occupationRate + "% and completed " +
                projectsCompleted + " projects.\nHis/Her estimated annual income is " + String.format("%.2f", getEstimatedAnnualIncome());
    }

    double getEstimatedAnnualIncome() {
        return monthlyIncome * (occupationRate / 100.0) * 12;
    }
}