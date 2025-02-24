import java.util.Scanner;

public class Return {

    public static void main(String[] args){
        greetUser(); // greeting user
        int num1 = readNumber(); // first number reading
        int num2 = readNumber(); // second number reading
        int sum = num1+num2; // sum
        System.out.println("Sum is: "+sum);
    }

    //Greeting user Function
    public static void greetUser(){
        System.out.println("Welcome to Addition Method");
    }

    //Reading number from user
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        return num;
    }

}
