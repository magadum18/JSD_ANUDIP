import java.util.Scanner;

class KidsLaptop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter Option:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Even/Odd Number");
            System.out.println("5 - Quit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    // Add
                    System.out.print("Enter the first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = sc.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Sum: " + sum);
                    break;

                case 2:
                    // Subtract
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextInt();
                    int difference = num1 - num2;
                    System.out.println("Difference: " + difference);
                    break;

                case 3:
                    // Multiply
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextInt();
                    int product = num1 * num2;
                    System.out.println("Product: " + product);
                    break;

                case 4:
                    // Even/Odd Number
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("It is an Even Number");
                    } else {
                        System.out.println("It is an Odd Number");
                    }
                    break;

                case 5:
                    // Quit
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please enter a valid option (1-5).");
                    break;
            }
        }
    }
}