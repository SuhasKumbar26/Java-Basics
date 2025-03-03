import java.util.Arrays;
import java.util.List;

public class listSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println(list);
        swap(list,0,9);
        System.out.println(list);
    }

    //method for sorting
    public static void swap(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x,list.get(y));
        list.set(y,swap);
    }
}
