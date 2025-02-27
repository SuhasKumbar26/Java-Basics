package BreakAndContinue;
import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Enter your command: ");
            String command = scan.next();
            if (command.equalsIgnoreCase("Exit")){
                break;
            }
        }
        System.out.println("Your Exited");
    }
}
