package stacksandqueues.stockspanproblem;

public class Stack {
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public Stack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    // Push index to stack
    public void push(int value) {
        stackArray[++top] = value;
    }

    // Pop top index from stack
    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    // Get top index
    public int top() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        return -1; // Return -1 if stack is empty
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
