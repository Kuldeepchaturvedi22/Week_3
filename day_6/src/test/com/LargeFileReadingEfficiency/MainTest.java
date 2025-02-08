package com.LargeFileReadingEfficiency;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    @Test
    void testFileReaderEfficiency() {
        // Redirect system output to capture the print statements
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the fileReader method with a sample file
        FileReaderEfficiency.fileReader("sample.txt");

        // Check if the output contains the expected result
        String expectedOutput = "Total characters read: ";
        assertTrue(outContent.toString().contains(expectedOutput));

        // Reset the system output
        System.setOut(System.out);
    }

    @Test
    void testInputStreamReaderEfficiency() {
        // Redirect system output to capture the print statements
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the fileReader method with a sample file
        InputStreamReaderEfficiency.fileReader("sample.txt");

        // Check if the output contains the expected result
        String expectedOutput = "Total characters read: ";
        assertTrue(outContent.toString().contains(expectedOutput));

        // Reset the system output
        System.setOut(System.out);
    }
}