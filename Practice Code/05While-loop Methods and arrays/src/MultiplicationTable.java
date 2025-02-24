import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        multiplication(num);
    }

    //Method to display Multiplication table
    public static void multiplication(int number){
        int i = 1;
        while(i<=10){
            System.out.println(number+" x "+ i +" = " +(number*i));
            i++;
        }
    }
}
