package challenges;

import java.util.Queue;
import java.util.LinkedList;

public class MergeQueue {
    public static Queue first() {
        Queue<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(4);
        first.add(5);
        first.add(8);
        return first;
    }

    public static Queue second() {
        Queue<Integer> second = new LinkedList<>();
        second.add(2);
        second.add(3);
        second.add(6);
        second.add(7);
        return second;
    }

    public static Queue<Integer> merge(Queue<Integer> first, Queue<Integer> second) {

        Queue<Integer> mergedQueue = new LinkedList<Integer>();
        while (!first.isEmpty() && !second.isEmpty()) {
            if (second.peek() > first.peek()) {
                mergedQueue.add(first.poll());
                mergedQueue.add(second.poll());
            } else {
                mergedQueue.add(second.poll());
                mergedQueue.add(first.poll());
            }
        }

        return mergedQueue;
    }

    public static void main(String[] args) {

        Queue result = merge(MergeQueue.first(), MergeQueue.second());
        System.out.println("1st Queue: " + MergeQueue.first());
        System.out.println("2nd Queue: " + MergeQueue.second());
        System.out.println("Merged Queue: " + result);

    }

}
