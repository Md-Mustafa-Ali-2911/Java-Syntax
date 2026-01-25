import java.util.*;

public class SortedMapDemo {

    public static void main(String args[]) {

        // SortedMap is an interface, extends Map and 
        // gurantee entries(keys) are sorted by natural or comparator and 
        // TreeMap is implementation

        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Vivek", 91);
        map.put("Shubham", 99);
        map.put("Mohit", 78);

        System.out.println(map);
    }
}