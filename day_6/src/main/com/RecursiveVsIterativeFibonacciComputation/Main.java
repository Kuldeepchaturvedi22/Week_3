package com.RecursiveVsIterativeFibonacciComputation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms to compute:");
        int number = scanner.nextInt();

        // Measure time for recursive approach
        long startTime = System.nanoTime();
        int recursiveResult = Recursive.fibonacciRecursive(number);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Measure time for iterative approach
        startTime = System.nanoTime();
        int iterativeResult = Iterative.fibonacciIterative(number);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        // Print results
        System.out.println("Time taken by Recursive approach is: "+recursiveTime);
        System.out.println("Time taken by Iterative approach is: "+iterativeTime);
    }
}