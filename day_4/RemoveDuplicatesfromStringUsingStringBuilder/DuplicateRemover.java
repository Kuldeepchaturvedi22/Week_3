package RemoveDuplicatesfromStringUsingStringBuilder;

import java.util.HashSet;

public class DuplicateRemover {

    // Method to remove duplicate characters from a string
    public static String removeDuplicate(String input) {
        // Create a HashSet to track characters
        HashSet<Character> characterSet = new HashSet<>();

        // Create a StringBuilder to build the result string
        StringBuilder resultBuilder = new StringBuilder();

        // Get the length of the input string
        int length = input.length();

        // Iterate over each character in the input string
        for (int index = 0; index < length; index++) {
            char currentChar = input.charAt(index);

            // If the character is not already in the set, add it to the result
            if (!characterSet.contains(currentChar)) {
                resultBuilder.append(currentChar);
                characterSet.add(currentChar);
            }
        }

        // Convert the StringBuilder to a string and return it
        return resultBuilder.toString();
    }
}