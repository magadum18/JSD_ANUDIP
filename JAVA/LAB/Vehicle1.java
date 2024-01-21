// Base class
class Vehicle {
    // Attributes
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Drive method
    void drive() {
        System.out.println("Vehicle is driving.");
    }
}

// Car subclass
class Car extends Vehicle {
    // Constructor
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive method
    @Override
    void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

// Bike subclass
class Bike extends Vehicle {
    // Constructor
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Override drive method
    @Override
    void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}


public class Vehicle1 {
    public static void main(String[] args) {
        // Instantiate Car and Bike classes
        Car myCar = new Car("Toyota", "Camry", 2022, 180);
        Bike myBike = new Bike("Honda", "CBR500R", 2021, 120);

        // Print attributes and drive
        System.out.println("Car details:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Maximum Speed: " + myCar.maximumSpeed);
        myCar.drive();

        System.out.println("\nBike details:");
        System.out.println("Make: " + myBike.make);
        System.out.println("Model: " + myBike.model);
        System.out.println("Year: " + myBike.year);
        System.out.println("Maximum Speed: " + myBike.maximumSpeed);
        myBike.drive();
    }
}
