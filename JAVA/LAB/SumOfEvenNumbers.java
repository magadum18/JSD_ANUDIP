import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(14);
        numbers.add(8);
        numbers.add(10);

        // Calculate the sum of even numbers
        int sum = calculateSumOfEvenNumbers(numbers);

        // Display the result
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        // Iterate through the ArrayList
        for (int number : numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                // Add the even number to the sum
                sum += number;
            }
        }

        return sum;
    }
}
