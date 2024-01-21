public class Student {
    // Instance variables
    private String name;
    private int age;
    private String department;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with name and age parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    // Constructor with all parameters
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to get student details
    public void getStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Create instances of the Student class using each constructor
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Vaibhav", 23); // Constructor with name and age parameters
        Student student3 = new Student("Saurabh", 22, "Computer Science"); // Constructor with all parameters

        // Print out the details of each student
        System.out.println("Student 1 details:");
        student1.getStudentDetails();
        System.out.println();

        System.out.println("Student 2 details:");
        student2.getStudentDetails();
        System.out.println();

        System.out.println("Student 3 details:");
        student3.getStudentDetails();
    }
}
