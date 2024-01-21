import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            // Input for basic salary
            System.out.print("Enter basic salary: ");
            double basicSalary = scanner.nextDouble();

            // Calculate HRA and DA based on conditions
            double hra, da;
            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }

            // Calculate gross salary
            double grossSalary = basicSalary + hra + da;

            // Print the gross salary
            System.out.println("Gross Salary: " + grossSalary);

            // Ask for user's choice to continue or exit
            System.out.print("Enter '-1' to exit or any other number to continue: ");
            userChoice = scanner.nextInt();

        } while (userChoice != 1);

        // Close the scanner
        scanner.close();
    }
}