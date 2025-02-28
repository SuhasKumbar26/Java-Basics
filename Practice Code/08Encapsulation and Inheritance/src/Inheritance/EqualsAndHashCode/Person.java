package Inheritance.EqualsAndHashCode;

import java.util.Objects;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Person per)) return false;
        return per.name.equals(name) && per.age == age ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
