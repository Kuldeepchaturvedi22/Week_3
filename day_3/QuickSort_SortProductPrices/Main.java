package QuickSort_SortProductPrices;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Used scanner object for taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of product prices: ");
        int n = sc.nextInt();

        // Integer array
        int[] productPrices = new int[n];
        System.out.println("Enter the product prices: ");
        for (int i = 0; i < n; i++) {
            productPrices[i] = sc.nextInt();
        }

        // Instance of QuickSort
        QuickSort quickSort = new QuickSort();
        // Method call of sort method
        quickSort.sort(productPrices, 0, n - 1);
        System.out.println("Sorted product prices: " + Arrays.toString(productPrices));
    }
}