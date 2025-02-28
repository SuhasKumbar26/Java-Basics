package Encapsulation.GetterAndSetter;

public class GetterSetterTest {
    public static void main(String[] args) {
        Car car = new Car("Black","Toyota",12.9,80000);
        System.out.printf("Color: %s Model: %s",car.getColor(),car.getModel());
        car.setColor("Yellow");
        System.out.printf("Color: %s Model: %s",car.getColor(),car.getModel());
    }
}
