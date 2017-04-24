package stacksandqueues;

public class CircularQueue {

    /*
    9.8

    Implement a queue API using an array for sorting elements.
    Your API should include a constructor function, which
    takes as argument the initial capacity of the queue,
    enqueue and dequeue functions, and a function which
    returns the number of elements stored. Implement dynamic
    resizing to support storing an arbitrarily large number
    of elements.
     */

    private int head = 0, tail = 0, numQueueElements = 0;
    private static final int SCALE_FACTOR = 2;
    private Integer[] entries;

    public CircularQueue(int capacity) {
        this.entries = new Integer[capacity];
    }

    public void enqueue(Integer x) {

    }

    public Integer dequeue() {

        return 0;
    }

    public int size() {
        return 0;
    }
}
