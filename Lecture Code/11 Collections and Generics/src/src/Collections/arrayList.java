package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Character> Alpha = new ArrayList<>();
        Alpha.add('D');
        Alpha.add('e');
        Alpha.add('v');
        Alpha.add('e');
        Alpha.add('l');
        Alpha.add('o');
        Alpha.add('p');
        Alpha.add('e');
        Alpha.add('r');

        //iteration
        for (Character character : Alpha) {
            System.out.print(character);
        } System.out.println();

        System.out.println(Alpha);

        //Methods
        Alpha.add(1,'#');
        System.out.println(Alpha);

        Alpha.remove(8);
        System.out.println(Alpha);

        Alpha.set(0,'J');
        System.out.println(Alpha);

        System.out.println(Alpha.get(7));
        System.out.println(Alpha.size());
        System.out.println(Alpha.indexOf('e'));
        System.out.println(Alpha.contains('e'));

        Alpha.clear();
        System.out.println(Alpha);


    }
}
