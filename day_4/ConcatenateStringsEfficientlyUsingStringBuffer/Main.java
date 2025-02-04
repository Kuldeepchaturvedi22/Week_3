package ConcatenateStringsEfficientlyUsingStringBuffer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            // Read the number of strings
            System.out.println("Enter the number of strings: ");
            int numberOfStrings = Integer.parseInt(bufferedReader.readLine());

            // Create an array to store the strings
            String[] stringArray = new String[numberOfStrings];

            // Read each string and store it in the array
            for (int index = 0; index < numberOfStrings; index++) {
                System.out.println("Enter string " + (index + 1) + ": ");
                stringArray[index] = bufferedReader.readLine();
            }

            // Concatenate the strings and print the result
            System.out.println(StringConcatenation.concatString(stringArray, numberOfStrings));
        } catch (IOException exception) {
            // Print the stack trace if an IOException occurs
            exception.printStackTrace();
        }
    }
}