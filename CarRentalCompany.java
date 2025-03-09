 class CarRentalCompany {
    // a) Private field for license plate
    private String licensePlate;
    // b) Private field to track if the car is rented
    private boolean isRented;
[;./]
    // c) Constructor to initialize the car with a license plate
    public CarRentalCompany(String licensePlate) {
        this.licensePlate = licensePlate;
        // By default, a new car is not rented
        this.isRented = false;
    }

    // d) Public method to rent the car if it's available
    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with plate " + licensePlate + " is now rented.");
        } else {
            System.out.println("Car with plate " + licensePlate + " is already rented.");
        }
    }

    // e) Public method to return the car if it's currently rented
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with plate " + licensePlate + " has been returned and is now available.");
        } else {
            System.out.println("Car with plate " + licensePlate + " is already available.");
        }
    }

    // f) Getter method to check if the car is rented
    public boolean isRented() {
        return isRented;
    }

    // (Optional) Getter for the license plate if needed elsewhere
    public String getLicensePlate() {
        return licensePlate;
    }
}