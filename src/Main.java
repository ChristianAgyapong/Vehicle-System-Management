public class Main {
    public static void main(String[] args) {
        // Create instances of vehicles
        Car car = new Car("V001", "Toyota Camry", 50, true);
        Motorcycle motorcycle = new Motorcycle("V002", "Harley Davidson", 30, true);
        Truck truck = new Truck("V003", "Ford F-150", 80, 2000);

        // Create a customer
        Customer customer = new Customer("C001", "John Doe");

        // Create a rental agency
        RentalAgency rentalAgency = new RentalAgency();
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        // Process rentals
        rentalAgency.processRental(customer, car, 3); // Rent a car for 3 days
        rentalAgency.processRental(customer, motorcycle, 2); // Rent a motorcycle for 2 days
        rentalAgency.processRental(customer, truck, 5); // Rent a truck for 5 days

        // Return vehicles
        car.returnVehicle();
        motorcycle.returnVehicle();
        truck.returnVehicle();

        // Print rental details
        System.out.println("Rental details for customer: " + customer.getName());
        for (Vehicle vehicle : customer.getRentalHistory()) {
            System.out.println("Vehicle ID: " + vehicle.getVehicleId() +
                               ", Model: " + vehicle.getModel() +
                               ", Rental Cost: $" + vehicle.calculateRentalCost(2)); // Sample calculation
        }
    }
}

