import java.util.HashSet;
import java.util.TreeSet;

class Hello {
    void hello() {
        System.out.println("Hello");
    }
}

public class SetDemo {

    public static void  HashSetDemo() {
        HashSet<Integer> st = new HashSet<>();

        st.add(10);
        st.add(5);
        st.add(20);            
        st.add(15);
        st.add(10);

        System.out.println("HashSet elements :" + st);

        System.out.println("Does HashSet contain 15? " + st.contains(15));

        st.remove(5);

        System.out.println("Size of set :" + st.size());

        st.clear();

        System.out.println("Hashset afetr clear : " + st);
    }

    public static void TreeSetDemo() {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(5);
        ts.add(15);
        ts.add(20);
        ts.add(8);

        System.out.println("Elements in TreeSet :" + ts);

        System.out.println("Does TreeSet contain 15? " + ts.contains(15));
        ts.remove(8);
        System.out.println("After removing 8: " + ts);

        System.out.println("Size of TreeSet : " + ts.size());

        System.out.println("Iterating TreeSet : ");
        for (Integer i : ts) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("First element : " + ts.first());
        System.out.println("Last element :" + ts.last());
        System.out.println("HeadSet :" + ts.headSet(15));
        System.out.println("TailSet : " + ts.tailSet(15));
        System.out.println("Subset ( 5 to 15): " + ts.subSet(5, 15));
    }

    public static void main(String args[]) {

        HashSetDemo();
        TreeSetDemo();

        Hello hl = new Hello();
        hl.hello();
    }
}