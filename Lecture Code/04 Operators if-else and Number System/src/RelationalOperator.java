import java.util.Scanner;

public class RelationalOperator {
    //Relational operators returns Boolean value
    public static void main(String[] args){
        int a = 2;
        int b = 8;

        System.out.println("(a==b): "+(a==b));
        System.out.println("(a!=b): "+(a!=b));
        System.out.println("(a>b): "+(a>b));
        System.out.println("(a>=b): "+(a>=b));
        System.out.println("(a<b): "+(a<b));
        System.out.println("(a<=b): "+(a<=b));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = input.nextInt();

        if (age>=18){
            System.out.print("You can Drive");
        } else System.out.print("Beta cycle chalao");
    }
}
