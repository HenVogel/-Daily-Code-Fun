// Write a function that calculates the sum of digits entered by the user. (If they enter 123, 6 is printed.)

import java.util.Scanner;  // Imports the Scanner class

public class sumOfInput { // Starts the class
    static void myMethod(String[] args) { // That one important thing in all the java code.
        Scanner numEntered = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter some numbers: "); // Asks for user input
        int other = numEntered.nextInt();  // Reads user input
        System.err.println("");  // BLANK LINE
        int sum = 0;
        while(other >= 1) {  // Base value of the number Entered
            int lastval = other % 10;  // LOGIC!!!
            other = other  / 10; 
            sum += lastval;
        }
        System.err.println("The total of those numbers is:");
        System.out.println(sum); // print that sum yeah
    }

    public static void main(String[] args) {
        myMethod(args);
    }
    
}
