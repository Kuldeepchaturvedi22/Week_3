package stacksandqueues.sortingstackusingrecursion;

import java.util.Stack;

// Class for sorting a stack using recursion
public class SortStack {
    // Method to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();

            // Recursively sort the remaining stack
            sortStack(stack);

            // Insert the popped element back at the correct position
            insertSorted(stack, top);
        }
    }

    // Helper method to insert an element in sorted order
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int top = stack.pop();
            insertSorted(stack, element);
            stack.push(top);
        }
    }
}