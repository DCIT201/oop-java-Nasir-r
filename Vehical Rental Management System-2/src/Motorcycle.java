class Motorcycle extends Vehicle implements Rentable {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public String getSpecialFeatures() {
        return "Helmet Included";
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println(customer.getName() + " rented a Motorcycle for " + days + " days. Total Cost: $" + calculateRentalCost(days));
        } else {
            System.out.println("Motorcycle is not available for rent.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned successfully.");
    }
}
