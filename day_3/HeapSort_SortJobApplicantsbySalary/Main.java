package HeapSort_SortJobApplicantsbySalary;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of salary demands
        System.out.print("Enter the number of salary demands: ");
        int n = sc.nextInt();

        // Create an array to store the salary demands
        int[] salaries = new int[n];

        // Prompt the user to enter the salary demands
        System.out.println("Enter the salary demands: ");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        // Create an instance of the HeapSort class
        HeapSort heapSort = new HeapSort();

        // Call the sort method to sort the salary demands
        heapSort.sort(salaries);

        // Print the sorted salary demands
        System.out.println("Sorted salary demands: " + Arrays.toString(salaries));
    }
}