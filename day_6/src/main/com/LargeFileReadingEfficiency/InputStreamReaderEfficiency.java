package com.LargeFileReadingEfficiency;

import java.io.*;

public class InputStreamReaderEfficiency {
    public static void fileReader(String filename) {
        // Try-with-resources to ensure the InputStreamReader is closed properly
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename), "UTF-8")) {
            int iterator;
            int count = 0;
            // Read the file character by character
            while ((iterator = inputStreamReader.read()) != -1) {
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