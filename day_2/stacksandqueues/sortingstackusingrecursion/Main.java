package stacksandqueues.sortingstackusingrecursion;

import java.util.Stack;

// Driver class to test sorting a stack
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        // Sort the stack
        SortStack.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
