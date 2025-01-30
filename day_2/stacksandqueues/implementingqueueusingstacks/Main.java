package stacksandqueues.implementingqueueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front element: " + queue.peek()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 20

        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); // 30
        System.out.println("Dequeued: " + queue.dequeue()); // 40

        System.out.println("Queue empty: " + queue.isEmpty()); // true
    }
}
