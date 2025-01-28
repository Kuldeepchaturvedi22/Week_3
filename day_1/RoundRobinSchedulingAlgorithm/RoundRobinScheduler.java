package RoundRobinSchedulingAlgorithm;

public class RoundRobinScheduler {
    private ProcessNode head;
    private ProcessNode tail;

    public RoundRobinScheduler() {
        this.head = null;
        this.tail = null;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Maintain circular nature
        }
    }

    // Remove a process by Process ID after its execution
    public void removeProcess(int processId) {
        if (head == null) return;

        ProcessNode current = head;
        ProcessNode prev = tail;
        do {
            if (current.processId == processId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Simulate the scheduling of processes in a round-robin manner with a fixed time quantum
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) return;

        ProcessNode current = head;
        int totalProcesses = countProcesses();
        int[] waitingTime = new int[totalProcesses];
        int[] turnAroundTime = new int[totalProcesses];
        int timeElapsed = 0;

        while (true) {
            boolean done = true;
            ProcessNode temp = head;
            do {
                if (temp.burstTime > 0) {
                    done = false;
                    if (temp.burstTime > timeQuantum) {
                        timeElapsed += timeQuantum;
                        temp.burstTime -= timeQuantum;
                    } else {
                        timeElapsed += temp.burstTime;
                        waitingTime[temp.processId - 1] = timeElapsed - (temp.burstTime + timeQuantum);
                        turnAroundTime[temp.processId - 1] = timeElapsed;
                        temp.burstTime = 0;
                    }
                }
                temp = temp.next;
            } while (temp != head);

            if (done) break;
        }

        displayProcessList();
        System.out.println("Average Waiting Time: " + calculateAverage(waitingTime));
        System.out.println("Average Turnaround Time: " + calculateAverage(turnAroundTime));
    }

    // Display the list of processes in the circular queue
    public void displayProcessList() {
        if (head == null) return;

        ProcessNode current = head;
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }

    // Count the total number of processes in the list
    private int countProcesses() {
        if (head == null) return 0;

        int count = 0;
        ProcessNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

    // Calculate the average of an array
    private double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }
}
