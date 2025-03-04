package FiltersAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class testingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,34,56,78,90);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum is: "+sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });

        System.out.println("new Sum using Functional Interface: "+newSum);

        int newSum2 = numbers.stream()
                .reduce(0,(a,b) -> a+b);

        System.out.println("new Sum2 usingReduce: "+newSum2);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a :b);

        System.out.println("new max usingReduce: "+ max);
    }
}
