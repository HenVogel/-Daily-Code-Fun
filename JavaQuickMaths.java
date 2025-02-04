// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args)    {
        // Create a Scanner object for user input
        Scanner number = new Scanner(System.in);
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        for (double i = 1.0; i <= 5.0; i+= 0.5) {
            System.out.printf("Number: %.1f  Ceil: %.1f  Floor: %.1f  Rint: %.1f  Round:%d \n", i, Math.ceil(i), Math.floor(i), Math.rint(i), Math.round(i));
        }
        System.out.println("");
        
        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("Enter a decimal number: ");
        double numEntered = number.nextDouble();
        System.out.printf("Ceil: %.1f  Floor: %.1f  Rint: %.1f  Round:%d \n", Math.ceil(numEntered), Math.floor(numEntered), Math.rint(numEntered), Math.round(numEntered));
        System.out.println("");

        // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.print("Enter an integer: ");
        int intEntered = number.nextInt();
        System.out.print("Enter a word: ");
        String stringEntered = number.next();
        System.out.println("You entered integer: " + intEntered);
        System.out.println("You entered string: " + stringEntered);
        System.out.println("");
        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        double implicit = intEntered;
        System.out.printf("Implicit cast (int -> double): %.1f", implicit);
        System.out.printf("\nExplicit cast (double -> int): %d", (int)numEntered);
        System.out.printf("\nCasting int to char (ASCII): %c\n", (char)intEntered);
        System.out.println("");
        
        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.print("Enter a character: ");
        char charEntered = number.next().charAt(0);
        int ascii = charEntered;
        System.out.printf("ASCII value of " + charEntered + " is: " + ascii);
        System.out.println("");
        System.out.println("");

        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        String str1 = "Hello";
        String str2 = str1;
        String str3 = new String("Hello");

        System.out.println("String Comparisons:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // Close the Scanner object
        number.close();
    }
}
