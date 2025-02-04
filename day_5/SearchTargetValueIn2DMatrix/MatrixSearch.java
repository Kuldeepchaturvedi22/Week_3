package SearchTargetValueIn2DMatrix;

public class MatrixSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        if (numRows == 0) return false;
        int numColumns = matrix[0].length;

        int left = 0;
        int right = numRows * numColumns - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / numColumns;
            int col = mid % numColumns;
            int midElement = matrix[row][col];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}