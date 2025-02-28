package Equals;

public class TestEquals {
    public static void main(String[] args) {
        Person person1 = new Person("Java",23,"java@123");
        Person person2 = new Person("Java",23,"java@123");

        if (person1.equals(person2)){
            System.out.println("Equals");
        } else System.out.println("Not equals");

        System.out.println("Hashcode 1: "+person1.hashCode());
        System.out.println("Hashcode 2: "+person2.hashCode());
    }
}
