package ConcatenateStringsEfficientlyUsingStringBuffer;

public class StringConcatenation {

    // Method to concatenate an array of strings
    public static String concatString(String[] array, int n) {
        // Create a StringBuffer to efficiently concatenate strings
        StringBuffer stringBuffer = new StringBuffer();

        // Iterate over each string in the array
        for (int i = 0; i < n; i++) {
            stringBuffer.append(array[i]);
        }

        // Convert the StringBuffer to a string and return it
        return stringBuffer.toString();
    }
}