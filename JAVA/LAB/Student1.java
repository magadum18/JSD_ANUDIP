 // Student1.java

public class Student1 {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Constructor
    public Student1(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }
    //accessor method to show the student details
     void displayStudent1(){
   System.out.println("studentName: "+this.studentName);
   System.out.println("collegeName: "+this.collegeName);
   System.out.println("studentID: "+this.studentID);
 
 }


    // Main method
    public static void main(String[] args) {
        // Print a message
        System.out.println("Successful");
    }
}
