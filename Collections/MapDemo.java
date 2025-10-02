import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    static void HashMapDemo() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        System.out.println("Alice's age : " + map.get("Alice"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Contains key 'Bob' ?" + map.containsKey("Bob"));
        System.out.println("Contains value 40 ? " + map.containsValue(40));

        map.remove("Charlie");

        map.replace("Alice", 26);

        System.out.println("Keys :" + map.keySet());

        System.out.println("Values :" + map.values());

        System.out.println("Eve's age : " + map.getOrDefault("BOb", -1));

        map.merge("Bob", 5, Integer:: sum);
        System.out.println("After merging Bob: " + map);
    }

    static void TreeMapDemo() {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Bob", 30);
        tm.put("Alice", 25);
        tm.put("Chralie", 28);

        System.out.println("TreeMap elements (Sorted by key) :" + tm);


        // More TreeMap operations
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());

        System.out.println("HeadMap (< Bob): " + tm.headMap("Bob"));
        System.out.println("TailMap (>= Bob): " + tm.tailMap("Bob"));
        System.out.println("SubMap (Alice to Chralie): " + tm.subMap("Alice", "Chralie"));
    }

    public static void main(String args[]) {

        HashMapDemo();
        TreeMapDemo();

    }
}