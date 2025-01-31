package MergeSort_SortanArrayofBookPrices;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Used scanner object for taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of book prices: ");
        int n = sc.nextInt();

        // Integer array
        int[] bookPrices = new int[n];
        System.out.println("Enter the book prices: ");
        for (int i = 0; i < n; i++) {
            bookPrices[i] = sc.nextInt();
        }

        // Instance of MergeSort
        MergeSort mergeSort = new MergeSort();
        // Method call of sort method
        mergeSort.sort(bookPrices, 0, n - 1);
        System.out.println("Sorted book prices: " + Arrays.toString(bookPrices));
    }
}