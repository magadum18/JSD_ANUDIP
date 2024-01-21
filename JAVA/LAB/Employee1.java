// Employee1.java

public class Employee1 {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    // Main method
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee1 employee = new Employee1();

        // Assign values with casting
        employee.age = (int) 35.5;

        // Print a message
        System.out.println("Successfully started");
    }
}
