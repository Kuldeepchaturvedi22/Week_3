package RoundRobinSchedulingAlgorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);
        scheduler.displayProcessList();

        scheduler.simulateRoundRobin(3);

        scheduler.removeProcess(2);
        System.out.println("After Deletion:");
        scheduler.displayProcessList();
    }
}
