package BubbleSort_SortStudentMarks;

public class BubbleSort {


    public void sort(double [] marks, int n) {

        // Create swapped variable to check weather it is ordered array or not
        boolean swapped;

        // Loop for sorting array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    double temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }
}
