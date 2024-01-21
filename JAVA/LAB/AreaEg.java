// Base class
class Shape {
    // Method to get area
    double getArea() {
        return 0.0; // Default implementation for demonstration purposes
    }
}

// Circle subclass
class Circle extends Shape {
    // Attributes
    int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Override getArea method for Circle
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square subclass
class Square extends Shape {
    // Attributes
    int length;

    // Constructor
    public Square(int length) {
        this.length = length;
    }

    // Override getArea method for Square
    @Override
    double getArea() {
        return length * length;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    // Attributes
    int width;
    int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override getArea method for Rectangle
    @Override
    double getArea() {
        return width * height;
    }
}

// Main class
public class AreaEg {
    public static void main(String[] args) {
        // Instantiate Circle, Square, and Rectangle
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 6);

        // Call getArea method for each shape
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
