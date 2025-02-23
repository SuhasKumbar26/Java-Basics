import java.util.Scanner;

public class AgeCategorizing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 60){
            System.out.println("Senior");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else if (age >=13) {
            System.out.println("TeenAger");
        } else System.out.println("Child");
    }
}
