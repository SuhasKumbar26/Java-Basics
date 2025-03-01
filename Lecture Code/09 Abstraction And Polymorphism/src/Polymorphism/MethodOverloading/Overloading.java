package Polymorphism.MethodOverloading;

public class Overloading {

    Overloading(){
        System.out.println("default constructor called...");
    }

    Overloading(String pop){
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
                  //signature.............
    public String add(String s, String s1){
        return s + s1;
    }


    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        int sum = overloading.add(3,4);
        System.out.println(overloading.add(sum,5));

        System.out.println(overloading.add(1,2,3,4));

        System.out.println(overloading.add("Java","Dev"));

        Overloading over = new Overloading("Jav@123");
    }
}
