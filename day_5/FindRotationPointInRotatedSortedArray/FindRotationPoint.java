package FindRotationPointInRotatedSortedArray;

public class FindRotationPoint {

    // Method to find the rotation point in a rotated sorted array
    public static int findRotationPoint(int[] array, int left, int right) {
        // Loop until the left index is less than the right index
        while (left < right) {
            // Calculate the middle index
            int middle = left + (right - left) / 2;

            // If the middle element is greater than the right element,
            // the rotation point is in the right half
            if (array[middle] > array[right]) {
                return findRotationPoint(array, middle + 1, right);
            }
            // If the middle element is less than the right element,
            // the rotation point is in the left half
            else if (array[middle] < array[right]) {
                return findRotationPoint(array, left, middle);
            }
        }
        // Return the rotation point
        return array[left];
    }
}