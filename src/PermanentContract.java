class PermanentContract extends Contract {
    double monthlySalary;
    int children;
    String civilStatus;
    double childAllowance;

    public PermanentContract(Employee employee, double monthlySalary, int children, String civilStatus, double childAllowance) {
        super(employee);
        this.monthlySalary = monthlySalary;
        this.children = children;
        this.civilStatus = civilStatus;
        this.childAllowance = childAllowance;
    }

    @Override
    double accumulatedSalary(int daysWorked) {
        int workingDaysPerMonth = 20;
        double childrenBonus = children * childAllowance;
        if (civilStatus.equals("married")) {
            childrenBonus *= 2;
        }
        return daysWorked * (monthlySalary + childrenBonus) / workingDaysPerMonth;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + employee.name + " is a " + getClass().getSimpleName().toLowerCase() +
                ". he is " + civilStatus + " and he/she has " + children + " children.\n" +
                "He/She has worked for " + (20 - employee.occupationRate) + " days and upon contract his/her monthly salary is " + String.format("%.2f", monthlySalary) + ".";
    }
}