package InsertionSort_SortEmployeeIDs;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Used scanner object for taking input form user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee IDs: ");
        int n = sc.nextInt();

        // Created an array of length n
        int[] employeeIDs = new int[n];
        System.out.println("Enter the employee IDs: ");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = sc.nextInt();
        }

        // Creating InsertionSort class instance
        InsertionSort insertionSort = new InsertionSort();

        // Called sort method
        insertionSort.sort(employeeIDs,n);
        System.out.println("Sorted employee IDs: " + Arrays.toString(employeeIDs));
    }
}

