package SelectionSort_SortExamScores;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of exam scores
        System.out.print("Enter the number of exam scores: ");
        int n = sc.nextInt();

        // Create an array to store the exam scores
        int[] examScores = new int[n];

        // Prompt the user to enter the exam scores
        System.out.println("Enter the exam scores: ");
        for (int i = 0; i < n; i++) {
            examScores[i] = sc.nextInt();
        }

        // Create an instance of the SelectionSort class
        SelectionSort selectionSort = new SelectionSort();

        // Call the sort method to sort the exam scores
        selectionSort.sort(examScores);

        // Print the sorted exam scores
        System.out.println("Sorted exam scores: " + Arrays.toString(examScores));
    }
}