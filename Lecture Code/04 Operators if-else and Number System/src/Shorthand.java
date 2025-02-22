import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 4;

        int x1 = input.nextInt();
//        num = num + x1;
        num += x1;
        System.out.println(num);
        int x2 = input.nextInt();
//        num = num + x2;
        num += x2;
        System.out.println(num);
    }
}
