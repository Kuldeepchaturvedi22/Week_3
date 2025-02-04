package CountOccurrenceUsingFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurrence {

    public static int appearedWord(String filePath, String word) {
        int count = 0;

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] stringArray = line.split(" ");

                // Count occurrences of the word
                for (String str : stringArray) {
                    if (str.equals(word)) {
                        count++;
                    }
                }
            }
        } catch (IOException exception) {
            // Print the stack trace if an IOException occurs
            exception.printStackTrace();
        }

        return count;
    }
}