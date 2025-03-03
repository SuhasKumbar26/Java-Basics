import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,4,3,2,9,89,4);
        System.out.println(Collections.frequency(list,4));
        System.out.println(Collections.frequency(list,89));
    }
}
