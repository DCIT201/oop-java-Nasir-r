class Car extends Vehicle implements Rentable {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public String getSpecialFeatures() {
        return "Air Conditioning, GPS Navigation";
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println(customer.getName() + " rented a Car for " + days + " days. Total Cost: $" + calculateRentalCost(days));
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car returned successfully.");
    }
}
