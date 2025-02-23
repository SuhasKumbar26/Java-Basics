import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: ");
        float p = input.nextFloat();
        System.out.print("Enter Time: ");
        float t = input.nextFloat();
        System.out.print("Enter Rate: ");
        float r = input.nextFloat();

        double CI = p * Math.pow((1+r/100),t);
        System.out.println("Simple Interest: "+ CI);
    }
}
