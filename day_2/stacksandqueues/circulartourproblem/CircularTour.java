package stacksandqueues.circulartourproblem;

import java.util.Queue;
import java.util.LinkedList;

public class CircularTour {
    private int[] petrol;
    private int[] distance;

    // Constructor to initialize the petrol and distance arrays
    public CircularTour(int[] petrol, int[] distance) {
        this.petrol = petrol;
        this.distance = distance;
    }

    // Method to find the starting petrol pump for a successful circular tour
    public int findStartingPoint() {
        int n = petrol.length;
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        // Loop through all the petrol pumps
        for (int i = 0; i < n; i++) {
            totalSurplus += petrol[i] - distance[i];  // Update the total surplus
            currentSurplus += petrol[i] - distance[i]; // Update current surplus

            // If the current surplus becomes negative, reset start point to the next pump
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        // If total surplus is negative, a tour is not possible
        if (totalSurplus < 0) {
            return -1;  // No valid starting point
        }

        return start;  // Return the valid starting pump index
    }
}
