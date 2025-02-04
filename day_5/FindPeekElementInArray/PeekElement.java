package FindPeekElementInArray;

public class PeekElement {

    public static int findPeakElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || array[mid] > array[mid - 1]) && (mid == array.length - 1 || array[mid] > array[mid + 1])) {
                return array[mid];
            }

            // If the left neighbor is greater, search the left half
            if (mid > 0 && array[mid] < array[mid - 1]) {
                right = mid - 1;
            } else {
                // If the right neighbor is greater, search the right half
                left = mid + 1;
            }
        }

        return -1; // This line will never be reached if the input array has at least one peak element
    }
}