package InsertionSort_SortEmployeeIDs;

public class InsertionSort {

    // Method to sort an array using insertion sort
    public void sort(int[] ids, int n) {
        // Traverse through 1 to n-1
        for (int i = 1; i < n; ++i) {
            int key = ids[i]; // Store the current element
            int j = i - 1;

            // Move elements of ids[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j]; // Shift element to the right
                j = j - 1;
            }
            ids[j + 1] = key; // Place the key element at its correct position
        }
    }
}