import java.util.*;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}



// 5 3

public class ArrayListClass {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(20);
        // System.out.println(list.get(10)); out of bound error
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(list);
        System.out.println(list.get(2)); // index
        System.out.println(list.size());

        for (int x : list) {
            System.out.print(x);
        }

        list.contains(3);
        list.remove(2); // 2nd index item

        list.add(1, 10); // at index

        list.set(2, 80); // replace 2 nd index

        // ArrayList size grow by 1.5 when size exceeded so to trim down when element removed use

        list.trimToSize(); // trim down size

        List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 6); // return fixed size array
        System.out.println(list1);
        System.out.println(list1.getClass().getName());
        // list1.add(3); // can't add or remove- only replace

        list1.set(1, 20);

        List<Integer> list2 = List.of(1, 2, 3, 4); // can't even replace
        
        list.addAll(list2);
        System.out.println(list);

        list.remove(2); // remove first occurrence of index

        list.remove(Integer.valueOf(1)); // First occurence of 1

        // converting to array

        Integer[] arr = list.toArray(new Integer[0]);

        list.sort(new MyComparator());
        System.out.println(list);

        // comparator - interface using which customize sorting

        // comparator contain compare object

        // using lambda

        list.sort((a, b) -> a - b);

        // Comparator<String> comparator = Comparator.comparing(Student :: getGpa()).reversed().thenComparing(Student :: getName());

        // students.sort((o1, o2) -> {
        //     if (o2.getGpa() - o1.getGpa() > 0) {
        //         return 1;
        //     } else if (o2.getGpa() - o1.getGpa() < 0) {
        //         return -1;
        //     } else {
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // }); 

        // ArrayList is not thraedsafe example

        ArrayList<Integer> list10 = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
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

        System.out.println("Size of list :" + list.size());
      }
}