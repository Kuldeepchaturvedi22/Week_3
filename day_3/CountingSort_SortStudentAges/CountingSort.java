package CountingSort_SortStudentAges;

public class CountingSort {

    // Method to sort an array using counting sort
    public void sort(int[] ages) {
        int n = ages.length;

        // The range of ages is from 10 to 18
        int range = 18 - 10 + 1;

        // Create a count array to store the frequency of each age
        int[] count = new int[range];

        // Create an output array to store the sorted ages
        int[] output = new int[n];

        // Store the count of each age
        for (int i = 0; i < n; i++) {
            count[ages[i] - 10]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - 10] - 1] = ages[i];
            count[ages[i] - 10]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }
}