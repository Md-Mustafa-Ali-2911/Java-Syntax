import java.util.*;

public class ArrayListDemo  {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList elements :");
        for (String s : list) System.out.print(s + " ");

        System.out.println("First element :" + list.get(0));

        list.set(2, "JavaScript");

        list.remove("C++");

        System.out.println("ArrayList elements :");
        for (String s : list) System.out.print(s + " ");
    }
}

// add, set, remove
// ArrayList<String> arr = new ArrayList<>();