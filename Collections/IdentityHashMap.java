import java.util.*;

public class IdentityHashMap {

    public static void main(String args[]) {
        String key1 = new String("key");
        String key2 = new String("key");

        Map<String, Integer> map = new HashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}