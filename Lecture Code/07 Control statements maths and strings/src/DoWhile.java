import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = 0;

        do {
            System.out.print("Enter age: ");
            age = scan.nextInt();
        } while (age <= 0 || age > 100);

        System.out.print("Your age is: "+age);
    }
}
