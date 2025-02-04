package SearchTargetValueIn2DMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of rows and columns
        System.out.println("Enter number of rows: ");
        int numRows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int numColumns = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[numRows][numColumns];
        System.out.println("Enter the elements of the matrix row by row: ");
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        // Prompt for the target value
        System.out.println("Enter the target value: ");
        int target = scanner.nextInt();

        // Search for the target value and print the result
        boolean result = MatrixSearch.searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}