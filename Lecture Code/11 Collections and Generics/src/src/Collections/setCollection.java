package src.Collections;

import java.util.HashSet;
import java.util.Set;

public class setCollection {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        System.out.println(fruits.size());
        boolean flag = fruits.add("Apple");
        System.out.println(flag);

        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Greps");
        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.remove("Greps");
        System.out.println(fruits.size());
        System.out.println(fruits);

    }
}
