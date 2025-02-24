import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Yes its prime");
        } else System.out.println("No not at all");
    }

    // method to find prime or not
    public static boolean isPrime(int num){
        int i =2;
        while(i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
