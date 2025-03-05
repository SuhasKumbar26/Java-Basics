package FiltersAndReduce;

import java.util.List;
import java.util.function.Consumer;

public class testingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Mango", "MuskMelon", "WaterMelon");
        System.out.println(fruits.size());

        System.out.println("Normal ForEach printing");
        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }

        //Functional interface
        System.out.println("\n\nNormal Stream printing");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.print(fruit+" ");
            }
        });

        //Lambda
        System.out.println("\n\nNormal Stream + Lambda printing");

        fruits.stream() // filter
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit)); //terminal operations returns stream


    }
}
