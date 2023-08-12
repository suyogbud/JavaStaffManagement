class TemporaryContract extends Contract {
    double hourlyWages;

    public TemporaryContract(Employee employee, double hourlyWages) {
        super(employee);
        this.hourlyWages = hourlyWages;
    }

    @Override
    double accumulatedSalary(int hoursWorked) {
        return hourlyWages * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + employee.name + " is a " + getClass().getSimpleName().toLowerCase() +
                ". he is a temporary employee with " + hourlyWages + " hourly salary and he has worked for 60 hours.";
    }
}