class Tester extends Employee {
    int bugsCorrected;

    public Tester(String name, int birthYear, double monthlyIncome, int bugsCorrected) {
        super(name, birthYear, monthlyIncome, 100);
        this.bugsCorrected = bugsCorrected;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + name + " has an Occupation rate: " + occupationRate + "% and corrected " +
                bugsCorrected + " bugs.\nHis/Her estimated annual income is " + String.format("%.2f", getEstimatedAnnualIncome());
    }

    double getEstimatedAnnualIncome() {
        return monthlyIncome * (occupationRate / 100.0) * 12;
    }
}