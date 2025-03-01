package Polymorphism.MethodOverriding;

public class Dog extends Animal{

    @Override // just for readability
    void sound() {
        super.sound();
        System.out.println("Dog is making sound Bow bow bow...\n");
    }
}
