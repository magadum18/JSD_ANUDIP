import java.util.Scanner;

public class InterestEg {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input principal amount (P)
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Input time in years (T)
        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Determine interest rate based on principal amount
        double interestRate;
        if (principal > 10000) {
            interestRate = 0.10; // 10% interest rate for amount > 10000
        } else if (principal >= 5000) {
            interestRate = 0.08; // 8% interest rate for amount between 10000 and 5000
        } else {
            interestRate = 0.05; // 5% interest rate for amount below 5000
        }

        // Calculate simple interest
        double simpleInterest = (principal * interestRate * time);

        // Display the result
        System.out.println("Principal amount (P): " + principal);
        System.out.println("Time (T): " + time + " years");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
