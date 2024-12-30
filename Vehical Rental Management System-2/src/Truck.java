class Truck extends Vehicle implements Rentable {
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + 50; // Extra charge for trucks
    }

    @Override
    public String getSpecialFeatures() {
        return "Large Storage Capacity";
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println(customer.getName() + " rented a Truck for " + days + " days. Total Cost: $" + calculateRentalCost(days));
        } else {
            System.out.println("Truck is not available for rent.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck returned successfully.");
    }
}
