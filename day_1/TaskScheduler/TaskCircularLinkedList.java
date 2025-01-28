package TaskScheduler;

public class TaskCircularLinkedList {
    private TaskNode head;
    private TaskNode tail;
    private TaskNode current;

    public TaskCircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a task at the beginning, end, or a specific position
    public void addTask(int taskId, String taskName, int priority, String dueDate, Integer position) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = current = newNode;
            tail.next = head;  // Make it circular
        } else if (position == null || position == size()) {  // Add at end
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Maintain circular nature
        } else if (position == 0) {  // Add at beginning
            newNode.next = head;
            head = newNode;
            tail.next = head;  // Maintain circular nature
        } else {  // Add at specific position
            TaskNode prev = null;
            TaskNode temp = head;
            int count = 0;
            while (count < position && temp != tail) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            if (count == position) {
                prev.next = newNode;
                newNode.next = temp;
            }
        }
    }

    // Remove a task by Task ID
    public void removeTask(int taskId) {
        if (head == null) return;

        TaskNode current = head;
        TaskNode prev = tail;
        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                if (this.current == current) {
                    this.current = current.next;
                }
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // View the current task and move to the next task
    public void viewCurrentTask() {
        if (current != null) {
            System.out.println("Current Task: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        }
    }

    // Display all tasks starting from the head node
    public void displayTasks() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public TaskNode searchTaskByPriority(int priority) {
        if (head == null) return null;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                return temp;
            }
            temp = temp.next;
        } while (temp != head);
        return null;
    }

    // Helper method to determine the size of the list
    private int size() {
        if (head == null) return 0;

        int size = 0;
        TaskNode temp = head;
        do {
            size++;
            temp = temp.next;
        } while (temp != head);
        return size;
    }

}
