import java.util.ArrayList;
import java.util.List;

class RentalAgency {
    private final List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void displayAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                vehicle.displayDetails();
            }
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equalsIgnoreCase(id) && vehicle.isAvailable()) {
                return vehicle;
            }
        }
        return null;
    }
}
