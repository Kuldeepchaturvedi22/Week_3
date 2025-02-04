package FindFirstAndLastOccurrence;

public class FirstAndLastOccurrence {

    public static int[] findFirstAndLast(int[] array, int target) {
        int first = findFirstOccurrence(array, target);
        int last = findLastOccurrence(array, target);
        return new int[]{first, last};
    }

    private static int findFirstOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static int findLastOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}