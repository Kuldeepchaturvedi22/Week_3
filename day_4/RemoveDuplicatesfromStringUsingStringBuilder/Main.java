package RemoveDuplicatesfromStringUsingStringBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            // Prompt the user to enter a string
            System.out.println("Enter string: ");
            String input = bufferedReader.readLine();

            // Remove duplicates from the string and print the result
            System.out.println(DuplicateRemover.removeDuplicate(input));

        } catch (IOException exception) {
            // Print the stack trace if an IOException occurs
            exception.printStackTrace();
        }
    }
}