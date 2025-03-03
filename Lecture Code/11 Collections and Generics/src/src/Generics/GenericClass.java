package src.Generics;

public class GenericClass<T> {
    private T thing;

    public GenericClass(T name){
        this.thing = name;
    }

    public T getThing(){
        return thing;
    }

    public void setThing(T thing){
        this.thing = thing;
    }
}
