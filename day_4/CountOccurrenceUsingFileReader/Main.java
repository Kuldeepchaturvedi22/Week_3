package CountOccurrenceUsingFileReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Define the file path
        String filePath = "sampleFile";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");

        // Read the word from the user
        String word = scanner.next();

        // Print the occurrence of the word in the file
        System.out.println("The occurrence of word " + word + " in file is: " + WordOccurrence.appearedWord(filePath, word));
    }
}