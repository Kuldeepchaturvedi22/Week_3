package BubbleSort_SortStudentMarks;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Used scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array: ");
        // length of an array
        int n = sc.nextInt();

        // double array
        double[] studentMarks = new double[n];
        System.out.println();

        System.out.print("Enter all "+n+" Element of array in single line separate them by giving space ");

        // Loop for taking multiple input from user
        for (int i = 0; i < n; i++) {
            studentMarks[i] = sc.nextDouble();
        }

        // Created object of BubbleSort class
        BubbleSort bubbleSort = new BubbleSort();

        // Call sort method
        bubbleSort.sort(studentMarks, n);
        System.out.println("Sorted student marks: " + Arrays.toString(studentMarks));
    }
}
