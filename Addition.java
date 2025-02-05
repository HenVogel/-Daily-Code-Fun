// BEGIN NOOOOOOOOOOOOOOOOOOOOOOOOOOO
import java.util.Random;
import java.util.Scanner;

public class Addition{
    @SuppressWarnings({ "ConvertToTryWithResources", "unused" }) //UHHHHHHHHHHHHHHHHHHHHHHH YEP NO YELLOW LINES NOW!!!!!
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate two random numbers between 0 and 9
        // SET number1 = RANDOM(0-9)
        // SET number2 = RANDOM(0-9)
        int number1 = random.nextInt(0, 9);
        int number2 = random.nextInt(0, 9);
        int answer;

        // Prompt user for input
        // PRINT "What is " + number1 + " + " + number2 + "? "
        // READ answer
        // Keep asking until the user gets it right
        // WHILE (answer ≠ number1 + number2) DO
        //     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "
        //     READ answer
        // END WHILE
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        while ((answer = scanner.nextInt()) != (number1 + number2)) {
           System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
        }

        // Correct answer message
        // PRINT "You got it!"
        System.out.println("You got it!");
        scanner.close();

        // END
    }
}