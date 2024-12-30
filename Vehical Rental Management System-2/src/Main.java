import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a RentalAgency and add some vehicles
        RentalAgency agency = new RentalAgency();
        agency.addVehicle(new Car("C001", "SRT", 1000));
        agency.addVehicle(new Car("C002", "Supra", 990));
        agency.addVehicle(new Truck("T001", "Ford F-150", 700));
        agency.addVehicle(new Truck("T002", "Toyota Tacoma", 600));
        agency.addVehicle(new Motorcycle("M001", "Yamaha", 200));
        agency.addVehicle(new Motorcycle("M002", "RoyalKing", 100));

        // Get customer information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String contactNumber;
        while (true) {
            System.out.print("Enter your contact number (10 digits): ");
            contactNumber = scanner.nextLine();
            if (contactNumber.length() == 10) {
                break;
            } else {
                System.out.println("Error: Contact number must be exactly 10 digits.");
            }
        }

        Customer customer = new Customer(name, contactNumber);

        // Display available vehicles
        agency.displayAvailableVehicles();

        // Rent a vehicle
        System.out.print("\nEnter the vehicle ID you want to rent: ");
        String vehicleId = scanner.nextLine();

        Vehicle selectedVehicle = agency.findVehicleById(vehicleId);
        if (selectedVehicle != null && selectedVehicle instanceof Rentable) {
            System.out.print("Enter number of days to rent: ");
            int days = scanner.nextInt();
            ((Rentable) selectedVehicle).rent(customer, days);
        } else {
            System.out.println("Vehicle not found or unavailable.");
        }

        System.out.println("\nThank you for using our Vehicle Rental Service!");
        scanner.close();
    }
}
