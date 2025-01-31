package CountingSort_SortStudentAges;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of student ages
        System.out.print("Enter the number of student ages: ");
        int n = sc.nextInt();

        // Create an array to store the student ages
        int[] ages = new int[n];

        // Prompt the user to enter the student ages
        System.out.println("Enter the student ages (between 10 and 18): ");
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            if (age < 10 || age > 18) {
                System.out.println("Invalid age: " + age + ". Please enter ages between 10 and 18.");
                i--; // Decrement i to retry the input for this index
            } else {
                ages[i] = age;
            }
        }

        // Create an instance of the CountingSort class
        CountingSort countingSort = new CountingSort();

        // Call the sort method to sort the student ages
        countingSort.sort(ages);

        // Print the sorted student ages
        System.out.println("Sorted student ages: " + Arrays.toString(ages));
    }
}