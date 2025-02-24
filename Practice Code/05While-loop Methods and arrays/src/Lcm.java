import java.util.Scanner;

public class Lcm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        int lcm = leastCommonMultiple(num1,num2);
        System.out.println("Lcm of two number is: "+lcm);
    }

    //method to calculate The Least common multiple
    public static int leastCommonMultiple(int first , int second){
        int mul = 1;
        int i = 1;
        while(i<=second){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
        return mul;
    }

}
