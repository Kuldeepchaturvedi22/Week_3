package ReadFileLinebyLineUsingFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Define the file path
        String filePath = "File";

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file and print it
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            // Print the stack trace if an IOException occurs
            exception.printStackTrace();
        }
    }
}