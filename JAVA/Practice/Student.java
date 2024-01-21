 // Student.java

public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Constructor
    public Student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    // Getter and Setter methods for each member variable
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // Main method
    public static void main(String[] args) {
        // Print a message
        System.out.println("Successful");
    }
}
