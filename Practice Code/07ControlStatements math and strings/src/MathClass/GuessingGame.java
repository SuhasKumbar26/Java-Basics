package MathClass;

import java.util.Scanner;

public class GuessingGame {

    int random;

    GuessingGame(){
        this.random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     *
     * @param guessNumber the number that player guessed
     * @return
     * - negative if the guessed number is smaller.
     * - 0 if the guessed number is correct.
     * - positive if the guessed number is higher.
     *
     *
     */

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to guessing game");
        GuessingGame game = new GuessingGame();
        int guess;
        int result;

        do {
            System.out.print("Enter ur guess: ");
            guess = scan.nextInt();
            result = game.guess(guess);

//          System.out.println("computer guess is: "+game.random);
//          System.out.println("result: "+result);

            if (result == 0){
                System.out.println("You win");
            } else if (result < 0) {
                System.out.println("try Higher number");
            } else System.out.println("Guess Smaller");
        } while(result != 0);
    }
}
