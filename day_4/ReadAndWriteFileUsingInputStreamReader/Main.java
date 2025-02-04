package ReadAndWriteFileUsingInputStreamReader;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "output.txt";

        // Use try-with-resources to ensure the streams are closed automatically
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filePath)) {

            String inputLine;
            System.out.println("Enter text (type 'exit' to quit):");

            // Read user input and write to file until "exit" is entered
            while (!(inputLine = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(inputLine + System.lineSeparator());
            }

        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}