import java.util.Scanner;

public class GradeEg {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input marks for five subjects
        System.out.println("Enter marks for five subjects (out of 100):");
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate total marks and average
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double average = totalMarks / 5.0;

        // Assign grades based on average marks
        String grade;
        if (average > 90) {
            grade = "Ex";
        } else if (average > 80) {
            grade = "A";
        } else if (average > 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Display the result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
