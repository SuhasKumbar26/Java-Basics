package src.Generics;

public class test {
    public static void main(String[] args) {
        GenericClass <String> names = new GenericClass<>("Java");
        System.out.println(names.getThing());
        names.setThing("Developer");
        System.out.println(names.getThing());

        GenericClass <Integer> numbers = new GenericClass<>(101);
        System.out.println(numbers.getThing());
        numbers.setThing(203);
        System.out.println(numbers.getThing());
    }
}
