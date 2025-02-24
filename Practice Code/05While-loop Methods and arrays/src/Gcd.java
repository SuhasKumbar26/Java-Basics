import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        int gcd = gcdOfNum(num1,num2);
        System.out.println("Gcd of number is: "+gcd);
    }

    // method to calculate the greatest common divisor
    public static int gcdOfNum(int first,int second){
        int gcd = 1;
        int i = 2;
        int least = LeastNum(first,second);
        while (i<=least){
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    // Least number method
    public static int LeastNum(int first,int second){
        if (first<second){
            return first;
        } else return second;
    }
}
