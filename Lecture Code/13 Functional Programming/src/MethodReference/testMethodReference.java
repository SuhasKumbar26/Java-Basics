package MethodReference;

import java.util.List;

public class testMethodReference {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1,4,5,6,7,2,3,9,0);

        myList.stream()
                .filter(num -> num % 2 == 1 )
                .forEach(num -> System.out.print(num));

        //method reference
        System.out.println("\nBy method reference");
        myList.stream()
                .filter(num -> num % 2 == 1 )
                .forEach(System.out::print);

        int sum  = myList.stream()
                         .reduce(0,(a,b) -> a + b);


        //By method reference
        int sum2  = myList.stream()
                         .reduce(0,Integer::sum);

        System.out.println("\n"+sum);
        System.out.println(sum2);
    }
}
