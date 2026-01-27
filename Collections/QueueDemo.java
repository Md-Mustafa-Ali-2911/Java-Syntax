// DS that works on FIFO 

import java.util.*;

public class QueueDemo {

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        // enqueue
        list.addLast(3);
        list.addLast(2);
        list.addLast(87);
        System.out.println(list);
        // dequeue
        System.out.println(list.removeFirst());

        // peek
        list.getFirst();

        // Queue
        Queue<Integer> q = new LinkedList<>();
        // LinkedList implementation class of Queue
        q.add(2); // offer
        q.add(3);
        q.add(4);
        System.out.println(q);
        System.out.println(q.remove()); // poll
        q.peek(); // element

        System.out.println(q.size());



    }
}