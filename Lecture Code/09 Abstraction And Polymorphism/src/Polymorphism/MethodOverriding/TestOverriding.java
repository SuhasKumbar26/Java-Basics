package Polymorphism.MethodOverriding;

public class TestOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        castSound(dog);
        castSound(cat);
    }

    //Run-time polymorphism
    public static void castSound(Animal ani){
        ani.sound();
    }
}
