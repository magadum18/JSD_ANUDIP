public class Rectangle {
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

    public static void main(String[] args) {
        // Instantiate two Rectangle objects with random values
        Rectangle rectangle1 = new Rectangle(5, 8);
        Rectangle rectangle2 = new Rectangle(4, 7);

        // Compare areas using the Relational Operator
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Print the result based on the comparison
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
