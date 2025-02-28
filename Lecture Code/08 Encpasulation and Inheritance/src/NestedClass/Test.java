package NestedClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        Car.Tyre t = new Car.Tyre();

        t.inflate();
    }
}
