package src.Map;

import java.util.HashMap;
import java.util.Map;

public class testingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple",70);
        map.put("Banana",23);
        map.put("Cherry",59);
        map.put("Graphs",47);
        map.put("Mango",100);

        System.out.println(map.containsKey("Apple"));
        System.out.println(map.get("Mangos"));
        System.out.println(map.keySet());
        System.out.println(map.remove("Graphs"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (String key : map.keySet()) {
            System.out.print(map.get(key)+" ");
        }
    }
}
