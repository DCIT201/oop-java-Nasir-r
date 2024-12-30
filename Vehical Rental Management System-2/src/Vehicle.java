// Abstract class Vehicle demonstrating Abstraction and Encapsulation
abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable = true;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Set availability status
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateRentalCost(int days);
    public abstract String getSpecialFeatures();

    // Display vehicle details
    public void displayDetails() {
        System.out.println("ID: " + vehicleId + ", Model: " + model +
                ", Rate per day: $" + baseRentalRate + ", Available: " + isAvailable);
    }
}
