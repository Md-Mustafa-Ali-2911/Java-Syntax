// Legacy class implements List interface, Synchronized- thread safe
// Overhead - Not to use when single threaded

import java.util.*;

public class VectorClass {
    public static void main(String args[]) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.size()); // 0
        System.out.println(vector.capacity()); // initialCapacity - 10
        // By default initial capacity increase bu double on exceeding

        // Vector<Integer> vc = new Vector<>(5, 2);  2nd parameter denote increase capacity

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(2, 3, 4));

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);

        Vector<Integer> vector2 = new Vector<>(linkedList1);

        // Methods
        // add(E e)
        // get()
        // add(int index, E element)
        // set(int index, E element)
        // remove(Object o)
        // remove(int index)
        // size()
        // isEmpty()
        // contains(Object o)
        // clear()

        // Synchronization - Thraed safe - performance decrease

        // 1. Vector is a legacy synchronized collection class that implements the List interface
        // 2. It behaves like a dynamic Array and grows as needed
        // 3. It provides thraed safety but with a performance cost in single-threaded environments
        // 4. In modern app, ArrayList or concurrent alternatives like CopyOnWriteArrayList are typically preferred over Vector unless thread safety is a priority

        // Thread safe example in ArrayList for arrayList

        Vector<Integer> list10 = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list10.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list10.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of vector :" + list10.size());




    }
}