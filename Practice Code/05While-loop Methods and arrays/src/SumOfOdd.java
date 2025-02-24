import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get sum of Odd: ");
        int num = sc.nextInt();
        int sum = sumOfOdds(num);
        System.out.println("Sum of odd is: "+sum);
    }

    //Method for Summing Odd number
    public static int sumOfOdds(int n){
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
