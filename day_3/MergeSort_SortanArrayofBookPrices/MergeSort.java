package MergeSort_SortanArrayofBookPrices;

public class MergeSort {

    // Method to sort an array using merge sort
    public void sort(int[] prices, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort the first and second halves
            sort(prices, left, middle);
            sort(prices, middle + 1, right);

            // Merge the sorted halves
            merge(prices, left, middle, right);
        }
    }

    // Method to merge two halves
    private void merge(int[] prices, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = prices[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = prices[middle + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }
}