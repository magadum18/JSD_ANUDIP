import java.util.Scanner;

public class IntConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String userInput = scanner.nextLine();

            // Attempt to convert the input to an integer
            int convertedValue = Integer.parseInt(userInput);

            System.out.println("Successfully converted to integer: " + convertedValue);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: Input is null.");
        } finally {
            
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
