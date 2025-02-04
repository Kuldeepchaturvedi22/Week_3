package ReverseStringUsingStringBuilder;

public class ReverseString {

    // Method to reverse a given string
    public static String reverse(String word) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append the string to stringBuilder
        stringBuilder.append(word);

        // Reverse the contents of the StringBuilder
        stringBuilder.reverse();

        // Convert the StringBuilder back to a string and return it
        return stringBuilder.toString();
    }
}
