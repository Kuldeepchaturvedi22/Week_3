package com.StringConcatenationPerformance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of operations to be performed: ");
        int operationCount = scanner.nextInt();

        // Measure the time taken by String concatenation
        long stringInitialTime = System.nanoTime();
        StringPerformance.stringConcatenation("string", operationCount);
        long stringTime = System.nanoTime();

        // Measure the time taken by StringBuilder concatenation
        long stringBuilderInitialTime = System.nanoTime();
        StringBuilderPerformance.stringBuilderConcatenation("string", operationCount);
        long stringBuilderTime = System.nanoTime();

        // Measure the time taken by StringBuffer concatenation
        long stringBufferInitialTime = System.nanoTime();
        StringBufferPerformance.stringBufferConcatenation("string", operationCount);
        long stringBufferTime = System.nanoTime();

        // Print the time taken by each method
        System.out.println("Time taken by String: " + (stringTime - stringInitialTime));
        System.out.println("Time taken by StringBuilder: " + (stringBuilderTime - stringBuilderInitialTime));
        System.out.println("Time taken by StringBuffer: " + (stringBufferTime - stringBufferInitialTime));
    }
}