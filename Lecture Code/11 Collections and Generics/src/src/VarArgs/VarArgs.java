package src.VarArgs;

public class VarArgs {
    public static void main(String... args) {
        System.out.println("sum: "+add(1,2,3,6,7));

        //at least two arguments is Mandatory.
        System.out.println("sum: "+add1(1,2,3,6,7,4,56,67));

        System.out.println("Sum: "+add(new int[]{23,17,107,203}));

    }
    //Ellipsis symbol(...)
    public static int add(int... a){
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }

    //at least two arguments is Mandatory.
    public static int add1(int first, int second, int... a){
        int sum = first + second;
        for (int i : a){
            sum+=i;
        }
        return sum;
    }
}
