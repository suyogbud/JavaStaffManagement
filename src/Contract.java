class Contract {
    Employee employee;

    public Contract(Employee employee) {
        this.employee = employee;
    }

    double accumulatedSalary(int daysWorked) {
        return 0;  // Placeholder; the calculation will be done in subclasses
    }

    @Override
    public String toString() {
        return "Contracts:\n-------------------------";
    }
}