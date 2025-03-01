package Polymorphism.Overload;

public class Calculator {
    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double d1, double d2){
        return d1 + d2;
    }

    static String add(String str1,String str2){
        return str1+str2;
    }

    public static void main(String[] args) {
        System.out.println(add("Always"," Java"));
        System.out.println(add(3,4,5));
        System.out.println(add(3.7,4.6));
    }
}
