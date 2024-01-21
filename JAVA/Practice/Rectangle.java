import java.util.Scanner;

public class Rectangle {
    // Attributes
    private int length;
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }

    // Method to compare rectangles and print results
    public static void compareRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        // Compare areas using Relational Operator
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Print results
        System.out.println("\nArea of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);
        System.out.println();

        // Compare and print results
        if (area1 > area2) {
            System.out.println("Rectangle 1 is larger than Rectangle 2");
        } else if (area1 < area2) {
            System.out.println("Rectangle 1 is smaller than Rectangle 2");
        } else {
            System.out.println("Both rectangles have equal areas");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Rectangle 1
        System.out.print("Enter length of Rectangle 1: ");
        int length1 = scanner.nextInt();
        System.out.print("Enter width of Rectangle 1: ");
        int width1 = scanner.nextInt();
        Rectangle rectangle1 = new Rectangle(length1, width1);

        // Get input for Rectangle 2
        System.out.print("Enter length of Rectangle 2: ");
        int length2 = scanner.nextInt();
        System.out.print("Enter width of Rectangle 2: ");
        int width2 = scanner.nextInt();
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Call the method to compare rectangles and print results
        compareRectangles(rectangle1, rectangle2);

        // Close the scanner
        scanner.close();
    }
}