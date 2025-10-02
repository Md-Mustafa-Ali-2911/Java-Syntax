import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String args[]) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List : " + list);

        list.addFirst(5);
        list.addFirst(40);
        list.addLast(85);

        System.out.println("Linked List : " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("Linked List : " + list);
    }
}

// add, addFirst, addLast, removeFirst, removeLast
// Use case: frequent insertions/deletions in the middle of list.