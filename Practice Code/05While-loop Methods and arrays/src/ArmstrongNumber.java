import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();

        int finalArmStrongNum = ArmStrongNum(num);

        if (num == finalArmStrongNum){
            System.out.println("Yes its...");
        } else System.out.println("Nope");
    }

    //Method to check Armstrong Number or not
    public static int ArmStrongNum(int num){
        int finalNumber = 0;
        //no of digits calculation
        int totalNoOfDigit = noOfDigits(num);

        while (num > 0){
            int lastDigit = num % 10;
            finalNumber += powSum(totalNoOfDigit,lastDigit);
            num /= 10;
        }

        System.out.println("final number: "+ finalNumber);
        return finalNumber;
    }

    //Method to calculate no of digits
    public static int noOfDigits(int n){
        int digits = 0;
        while (n > 0){
            n /= 10;
            digits++;
        }

        System.out.println("no of digits: "+digits);
        return digits;
    }

    //power summing Method
    public static int powSum(int pow,int digit){
        int i = 1;
        int sum = 1;
        while(i<=pow){
            sum *= digit;
            i++;
        }

        System.out.println("sum is: "+sum);
        return sum;
    }
}
