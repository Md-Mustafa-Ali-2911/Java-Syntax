import java.util.*;

public class PriorityQueueDemo {
    // Part of Q interface
    // Orders element based on their natural ordering (for primitive lowest first)
    // Custom comparator for customized ordering
    // Doesn't allow null element

    public static void main(String args[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}