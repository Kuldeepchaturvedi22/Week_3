package com.LargeFileReadingEfficiency;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEfficiency {
    public static void fileReader(String filename) {
        // Try-with-resources to ensure the FileReader is closed properly
        try (FileReader fileReader = new FileReader(filename)) {
            int iterator;
            int count = 0;
            // Read the file character by character
            while ((iterator = fileReader.read()) != -1) {
                count++;
            }
            // Print the total number of characters read
            System.out.println("Total characters read: " + count);
        } catch (IOException e) {
            // Handle any IO exceptions that occur
            e.printStackTrace();
        }
    }
}