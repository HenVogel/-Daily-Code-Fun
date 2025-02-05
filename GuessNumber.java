// BEGIN
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Choose a hidden number
        Random random = new Random();
        int numberButNotNumber = random.nextInt(1, 100);
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to start guessing
        System.out.println("Guess a number between 1 and 100: ");

        // Repeat until the correct guess is made
        // WHILE (true) DO
        //     Ask for a guess
        //     Get user input
        while (true) { 
            System.out.print("Enter guess: ");
            int guess = scanner.nextInt();

            if (guess == numberButNotNumber) {
                System.out.println("CONGRATSSSSSSSSS YOU SMART NOW!!!!!");
                break;
            } else if (guess > numberButNotNumber) {
                System.out.println("TOO HIGH TRY AGAIN: ");
                System.out.println("");
            } else {
                System.out.println("TOO LOW TRY AGAIN: ");
                System.out.println("");
            }
        //     IF the guess is correct THEN
        //         Display success message
        //         Exit the loop
        //     ELSE IF the guess is too high THEN
        //         Give a hint
        //     ELSE
        //         Give a different hint
        //     END IF
        // END WHILE

        // END
        }
        scanner.close();
    }
}