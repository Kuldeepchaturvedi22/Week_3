package TaskScheduler;

public class Main {
    public static void main(String[] args) {
        TaskCircularLinkedList taskList = new TaskCircularLinkedList();
        taskList.addTask(1, "Task 1", 1, "2023-01-01", null);
        taskList.addTask(2, "Task 2", 2, "2023-02-01", null);
        taskList.addTask(3, "Task 3", 3, "2023-03-01", 0);
        taskList.displayTasks();

        System.out.println("Current Task:");
        taskList.viewCurrentTask();

        taskList.removeTask(2);
        System.out.println("After Deletion:");
        taskList.displayTasks();

        TaskNode highPriorityTask = taskList.searchTaskByPriority(1);
        if (highPriorityTask != null) {
            System.out.println("High Priority Task Found: " + highPriorityTask.taskName);
        } else {
            System.out.println("No High Priority Task Found.");
        }
    }

}
