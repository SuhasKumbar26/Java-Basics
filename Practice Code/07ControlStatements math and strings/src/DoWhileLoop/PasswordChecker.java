package DoWhileLoop;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter Password: ");
            password = scan.nextLine();
        } while (!isValidPassword(password));
        System.out.println("Thank you for verification");
    }

    // method to check password
    public static boolean isValidPassword(String password){
        return password.length() >= 6;
    }
}
