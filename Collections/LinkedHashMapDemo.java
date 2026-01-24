import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String args[]) {

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Subclass of HashMap
        // Insertion order maintain

        lhm.put("Orange", 10);
        lhm.put("Mango", 20);
        lhm.put("Guava", 15);

        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}