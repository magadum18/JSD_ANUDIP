public class StringOperations {
    public static void main(String[] args) {
        // Create the original string
        String originalString = "Welcome to Java World";

        // 1. Returns the character at 5th position and display it.
        char charAt5 = originalString.charAt(4);
        System.out.println("Character at 5th position: " + charAt5);

        // 2. Compares the above String with "Welcome" lexicographically ignoring case differences and display the result.
        boolean isEqualIgnoreCase = originalString.equalsIgnoreCase("Welcome");
        System.out.println("Comparison with 'Welcome' (ignoring case): " + isEqualIgnoreCase);

        // 3. Concatenates "- Let us learn" to the above string and display it.
        String concatenatedString = originalString.concat("- Let us learn");
        System.out.println("Concatenated String: " + concatenatedString);

        // 4. Returns the position of the first occurrence of character 'a' and display it.
        int indexOfA = originalString.indexOf('a');
        System.out.println("Position of first 'a': " + indexOfA);

        // 5. Replaces all the occurrences of 'a' character with the new 'e' and display it.
        String replacedString = originalString.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedString);

        // 6. Returns string between 4th position and 10th position and display it.
        String substring = originalString.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + substring);

        // 7. Returns the lowercase of the string and display it.
        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase String: " + lowercaseString);
    }
}
