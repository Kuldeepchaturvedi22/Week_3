package com.LargeFileReadingEfficiency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file size in MB
        System.out.println("Enter file size in MB eg: 10,100,500 :");
        int size = scanner.nextInt();
        String filename;

        // Check if the entered size is one of the specified values
        if (size == 10 || size == 100 || size == 500) {
            // Determine the filename based on the entered size
            if (size == 10) {
                filename = "D:\\CG lab work\\week 3\\10MBFile.txt";
            } else if (size == 100) {
                filename = "D:\\CG lab work\\week 3\\100MBFile.txt";
            } else {
                filename = "D:\\CG lab work\\week 3\\500MBFile.txt";
            }

            // Measure the time taken by FileReader to read the file
            long fileReaderInitialTime = System.nanoTime();
            FileReaderEfficiency.fileReader(filename);
            long fileReaderTime = System.nanoTime();

            // Measure the time taken by InputStreamReader to read the file
            long inputStreamReaderInitialTime = System.nanoTime();
            InputStreamReaderEfficiency.fileReader(filename);
            long inputStreamReaderTime = System.nanoTime();

            // Print the time taken by each reader
            System.out.println("Time taken by fileReader is : " + (fileReaderTime - fileReaderInitialTime));
            System.out.println("Time taken by inputStreamReader is : " + (inputStreamReaderTime - inputStreamReaderInitialTime));
        } else {
            // Print a message if the entered size is not valid
            System.out.println("Enter mention size :");
        }
    }
}