class Vehicle {
    String make;
    String plate;
    String color;
    String category;

    public Vehicle(String make, String plate, String color, String category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employee has a " + getClass().getSimpleName().toLowerCase() + "\n" +
                "- make: " + make + "\n" +
                "- plate: " + plate + "\n" +
                "- color: " + color + "\n" +
                "- category: " + category;
    }
}