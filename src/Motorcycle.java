class Motorcycle extends Vehicle {
    boolean withSidecar;

    public Motorcycle(String make, String plate, String color, String category, boolean withSidecar) {
        super(make, plate, color, category);
        this.withSidecar = withSidecar;
    }

    @Override
    public String toString() {
        String sidecarStatus = withSidecar ? "with" : "without";
        return super.toString() + "\n- " + sidecarStatus + " sidecar";
    }
}