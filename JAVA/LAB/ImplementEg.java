// Abstract class
abstract class Shape {
    // Abstract method
    abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    // Attribute
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    // Attributes
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    double calculateArea() {
        return width * height;
    }
}

// Main class
public class ImplementEg {
    public static void main(String[] args) {
        // Instantiate Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculate and print the areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
