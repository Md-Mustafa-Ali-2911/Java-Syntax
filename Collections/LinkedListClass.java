// public class LinkedListClass {

//     public static void main(String args[]) {
//         Node node1 = new Node();
//         node1.data = 10;
//         node1.next = null;
//     }
// }

// class Node {

//     public int data;
//     public Node next;

// }
import java.util.*;

public class LinkedListClass {
    public static void main(String args[]) {
        LinkedList<Integer> linkedList =  new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.get(2); // by index t.c O(n)
        linkedList.addFirst(1); // t.c O(1)
        linkedList.getFirst();
        linkedList.addLast(100);
        linkedList.getLast();

        System.out.println(linkedList);

        // remove

        // linkedList.remove(1);
        // linkedList.removeFirst();
        // linkedList.removeLast();
        // linkedList.removeIf(list -> list % 2 == 0);
        // linkedList.removeAll();
        // linkedList.removeFirstOccurence(10);
        // linkedList.removeLastOccurence(20);

        System.out.println(linkedList);


    }
}