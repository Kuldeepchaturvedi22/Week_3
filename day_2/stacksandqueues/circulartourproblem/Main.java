package stacksandqueues.circulartourproblem;

public class Main {
    public static void main(String[] args) {
        // Petrol and distance arrays for each pump
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        // Create an instance of CircularTour
        CircularTour circularTour = new CircularTour(petrol, distance);

        // Find and print the starting point for a successful circular tour
        int start = circularTour.findStartingPoint();
        if (start == -1) {
            System.out.println("No valid starting point for a circular tour.");
        } else {
            System.out.println("The starting petrol pump index for a circular tour is: " + start);
        }
    }
}
