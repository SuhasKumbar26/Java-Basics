import java.util.Scanner;

public class LogicalOperator {
    // AND OR NOT operators
    // Math operators >> Relational Operator >> Logical Operator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ur Age: ");
        int age = input.nextInt();
        System.out.print("Are you Female(T/F): ");
        boolean gender = input.nextBoolean();

        if (age < 5 ){
            System.out.print("You have 75% discount");
        } else if (gender) {
            System.out.print("You have 25% discount");
        } else if (age > 60 && !gender){
            System.out.print("You have 10% discount");
        } else System.out.print("Oops... no discount");
    }
}
