import java.util.Scanner;

public class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Display method
    public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println();
          
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input to create a car object
        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String make = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Year: ");
        short year = sc.nextShort();

        System.out.print("Price: ");
        int price = sc.nextInt();

        // Create car object using the input
        Car userCar = new Car(make, model, year, price);

        // Display the car details
        System.out.println("\nCar details:");
        userCar.displayCarDetails();

        sc.close();
    }
}
