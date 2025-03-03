package src.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class queueCollection {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num);

        //methods
        num.add(6); // throws exception
        num.offer(7); // returns false
        System.out.println(num);

        num.remove(); // throws exception
        num.poll(); // returns null l
        System.out.println(num);

        System.out.println(num.element()); // throws exception
        System.out.println(num.peek()); // returns null
        System.out.println(num);

        num.clear();
        System.out.println(num.poll());
    }
}
