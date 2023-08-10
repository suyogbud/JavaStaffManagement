class Employee {
    String name;
    int birthYear;
    double monthlyIncome;
    int occupationRate;
    Contract contract;
    Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlyIncome, int occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.occupationRate = Math.max(10, Math.min(100, occupationRate));
        this.contract = null;
        this.vehicle = null;
    }

    int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "We have a new employee: " + name + ", " + getClass().getSimpleName();
    }
}