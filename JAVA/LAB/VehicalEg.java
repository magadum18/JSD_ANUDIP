// Base class
class Vehicle {
    // Method to start the vehicle
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Override start method for Car
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    // Override start method for Motorcycle
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

// Garage class
class Garage {
    // Method to service a vehicle
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}


public class VehicalEg {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        // Create an instance of the Garage class
        Garage myGarage = new Garage();

        // Call serviceVehicle method with Car and Motorcycle instances
        myGarage.serviceVehicle(myCar);
        myGarage.serviceVehicle(myMotorcycle);
    }
}
