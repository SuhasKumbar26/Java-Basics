import java.util.Arrays;
import java.util.List;

public class listReverse {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(integerList);
        reverse(integerList);
        System.out.println(integerList);
    }

    public static void reverse(List<Integer> list){
        //Collections.reverse(list);
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            int last = list.size()-1-i;
            list.set(i, list.get(last));
            list.set(last, temp);
        }
    }
}
