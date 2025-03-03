package src.Collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> numbers = new Vector<>();
        numbers.add(19);
        numbers.add(57);
        numbers.add(13);
        numbers.add(23);
        numbers.add(74);

        System.out.println(numbers);

        //methods of Collection class
        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        List<Integer> unModifiable = Collections.unmodifiableList(numbers);
//      unModifiable.add(90);
    }
}
