public class StringManipulation {
    public static void main(String[] args) {
        // Create the original string
        String originalString = "Welcome to Java World";

        // 1. Returns the character at 5th position and display it.
        char charAt5thPosition = originalString.charAt(4);
        System.out.println("1. Character at 5th position: " + charAt5thPosition);

        // 2. Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
        boolean isEqualToWelcome = originalString.equalsIgnoreCase("Welcome");
        System.out.println("2. String is equal to 'Welcome': " + isEqualToWelcome);

        // 3. Concatenates “- Let us learn” to the above string and display it.
        String concatenatedString = originalString.concat(" - Let us learn");
        System.out.println("3. Concatenated String: " + concatenatedString);

        // 4. Returns the position of the first occurrence of character ‘a’ and display it.
        int indexOfA = originalString.indexOf('a');
        System.out.println("4. Position of 'a': " + indexOfA);

        // 5. Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
        String replacedString = originalString.replace('a', 'e');
        System.out.println("5. String after replacing 'a' with 'e': " + replacedString);

        // 6. Returns string between 4th position and 10th position and display it.
        String substringFrom4to10 = originalString.substring(3, 10);
        System.out.println("6. Substring between 4th and 10th position: " + substringFrom4to10);

        // 7. Returns the lowercase of the string and display it.
        String lowercaseString = originalString.toLowerCase();
        System.out.println("7. Lowercase of the string: " + lowercaseString);
    }
}
