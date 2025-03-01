package Polymorphism.MethodOverriding;

public class Cat extends Animal{

    @Override // just for readability
    void sound() {
        super.sound();
        System.out.println("Cat is making sound Mew mew mew...\n");
    }
}
