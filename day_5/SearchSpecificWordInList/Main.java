package SearchSpecificWordInList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt for taking string input
        System.out.println("Enter length of string array: ");
        int arrayLength = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        // Initialize String array
        String[] stringArray = new String[arrayLength];
        System.out.println("Enter sentences: ");
        for (int index = 0; index < arrayLength; index++) {
            stringArray[index] = scanner.nextLine();
        }

        System.out.println("Enter specific word: ");
        String specificWord = scanner.nextLine();

        // Search for the specific word and print the result
        String result = SearchWord.searchSpecificWord(stringArray, specificWord);
        System.out.println(result);
    }
}