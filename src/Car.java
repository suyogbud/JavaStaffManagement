class Car extends Vehicle {
    String gear;
    String carType;

    public Car(String make, String plate, String color, String category, String gear, String carType) {
        super(make, plate, color, category);
        this.gear = gear;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- gear type: " + gear + "\n- type: " + carType;
    }
}