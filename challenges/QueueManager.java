package challenges;

/**
 * Queue Manager
 * 1. "has a" Queue
 * 2. support management of Queue tasks (aka: titling, adding a list, printing)
 */
public class QueueManager<T> {
    // queue data
    private String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object

    /**
     * Queue constructor
     * Title with empty queue
     */
    public QueueManager(String name) {
        this.name = name;
    }

    /**
     * Queue constructor
     * Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
        this.deleteList(seriesOfObjects);
    }

    public QueueManager(T[]... seriesOfObjects) {
        this.addList(seriesOfObjects);
    }

    public void enqueue(T[]... seriesOfObjects) {
        for (T[] objects : seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
            }
    }

    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects : seriesOfObjects)
            for (T data : objects) {
                System.out.println("Enqueued data: " + data);
                this.queue.add(data);
                this.count++;
                printQueue();
            }
    }

    public void deleteList(T[]... seriesOfObjects) {
        for (T[] objects : seriesOfObjects) {
            for (T data : objects) {
                System.out.println("Dequeued data: " + data);
                this.queue.delete();
                this.count--;
                printQueue();

            }
        }
    }

    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.println(this.name + " count: " + count);
        System.out.print(this.name + " data: ");
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }
}
