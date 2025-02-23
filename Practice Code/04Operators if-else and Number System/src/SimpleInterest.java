import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Price: ");
        float p = obj.nextFloat();
        System.out.print("Enter Time: ");
        float t = obj.nextFloat();
        System.out.print("Enter Rate: ");
        float r = obj.nextFloat();

        float SI = (p*t*r)/100;
        System.out.println("Simple Interest: "+SI);

    }
}
