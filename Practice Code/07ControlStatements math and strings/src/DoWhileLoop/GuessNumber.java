package DoWhileLoop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int actualNum = 5;
        int guessedNumber = 0;

        do {
            System.out.print("Guess the number: ");
            guessedNumber = scan.nextInt();
        } while (guessedNumber != actualNum);

        System.out.println("Your last guess was correct");
    }
}
