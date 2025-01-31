package QuickSort_SortProductPrices;

public class QuickSort {

    // Method to sort an array using quick sort
    public void sort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(prices, low, high);

            // Recursively sort elements before and after partition
            sort(prices, low, pi - 1);
            sort(prices, pi + 1, high);
        }
    }

    // Method to partition the array
    private int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Pivot element
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (prices[j] <= pivot) {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap prices[i+1] and prices[high] (or pivot)
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}