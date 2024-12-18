
    
    public class Motorcycle extends Vehicle implements Rentable {
        private boolean hasHelmet;
    
        public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasHelmet) {
            super(vehicleId, model, baseRentalRate);
            this.hasHelmet = hasHelmet;
        }
    
        @Override
        public double calculateRentalCost(int days) {
            double cost = getBaseRentalRate() * days;
            if (hasHelmet) {
                cost += 2 * days; // Additional cost for helmet
            }
            return cost;
        }
    
        @Override
        public boolean isAvailableForRental() {
            return isAvailable();
        }
    
        @Override
        public void rent(Customer customer, int days) {
            if (isAvailableForRental()) {
                setAvailable(false);
                System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");
            } else {
                System.out.println("Motorcycle is not available.");
            }
        }
    
        @Override
        public void returnVehicle() {
            setAvailable(true);
            System.out.println("Motorcycle returned.");
        }
    }
    
