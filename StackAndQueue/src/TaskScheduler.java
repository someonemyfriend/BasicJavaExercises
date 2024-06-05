import java.util.PriorityQueue;

class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}

public class TaskScheduler {
    private PriorityQueue<Task> taskQueue;

    public TaskScheduler() {
        taskQueue = new PriorityQueue<>((t1, t2) -> t2.getPriority() - t1.getPriority());
    }

    public void addTask(String name, int priority) {
        Task task = new Task(name, priority);
        taskQueue.offer(task);
    }

    public Task getNextTask() {
        return taskQueue.poll();
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Sample input commands
        scheduler.addTask("Clean", 1);
        scheduler.addTask("Work", 2);
        Task nextTask = scheduler.getNextTask();
        if (nextTask != null) {
            System.out.println(nextTask.getName() + " - " + nextTask.getPriority());
        } else {
            System.out.println("No tasks in the queue.");
        }

        scheduler.addTask("Exercise", 3);
        scheduler.addTask("Study", 4);
        nextTask = scheduler.getNextTask();
        if (nextTask != null) {
            System.out.println(nextTask.getName() + " - " + nextTask.getPriority());
        } else {
            System.out.println("No tasks in the queue.");
        }
    }
}
