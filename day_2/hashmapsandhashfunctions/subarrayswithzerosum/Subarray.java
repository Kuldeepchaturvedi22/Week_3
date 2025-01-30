package hashmapsandhashfunctions.subarrayswithzerosum;

import java.util.List;

public class Subarray {
    // The list to store elements of the subarray
    private List<Integer> elements;

    // Constructor to initialize the subarray with elements
    public Subarray(List<Integer> elements) {
        this.elements = elements;
    }

    // Method to get the elements of the subarray
    public List<Integer> getElements() {
        return elements;
    }

    // Method to print the subarray
    public void printSubarray() {
        System.out.println(elements);
    }
}
