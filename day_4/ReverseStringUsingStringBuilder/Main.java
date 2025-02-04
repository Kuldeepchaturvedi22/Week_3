package ReverseStringUsingStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            // Prompt the user to enter any word
            System.out.println("Enter any word: ");
            String word = bufferedReader.readLine();

            // Reverse the word and print the result
            System.out.println(ReverseString.reverse(word));

        } catch (IOException exception) {
            // Print the stack trace if an IOException occurs
            exception.printStackTrace();
        }
    }
}