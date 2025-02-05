// BEGIN
import java.util.Scanner;

public class Dolt {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Declare a variable for user input
        Scanner scanner = new Scanner(System.in);
        int number;

        // REPEAT AT LEAST ONCE
        // DO
        //     Prompt the user to enter a positive number
        //     Read input
        // WHILE (input is negative)
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number < 0);

        // Display valid input message
        System.out.println("Input of " + number + " is valid!!!!!!");
        scanner.close();
        
        // END
    }
}