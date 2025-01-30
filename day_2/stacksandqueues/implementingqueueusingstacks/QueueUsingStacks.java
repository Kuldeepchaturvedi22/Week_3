package stacksandqueues.implementingqueueusingstacks;

import java.util.Stack;

// Queue implementation using two stacks
public class QueueUsingStacks {
    private Stack<Integer> stack1; // Stack for enqueue
    private Stack<Integer> stack2; // Stack for dequeue

    // Constructor to initialize stacks
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 if stack2 is empty
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, queue was empty
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }

    // Peek operation (Get front element without removing)
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
