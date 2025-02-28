package Inheritance.EqualsAndHashCode;

public class Test {
    public static void main(String[] args) {
        Person per1 = new Person("java",30);
        Person per2 = new Person("java",30);
        if (per1.equals(per2)){
            System.out.println("Haa Hai");
        }

        System.out.println(per1.hashCode());
        System.out.println(per2.hashCode());
    }
}
