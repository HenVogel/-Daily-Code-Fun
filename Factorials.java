// Factorial of a non-negative integer n (denoted as n!) is the product of all positive integers from 1 to n, with 0! defined as 1.
// For example, 3! = 3 * 2 * 1 = 6
// For this warmup using Java you will:
// Have the user enter an integer (no validation).
// Compute the factorial using a separate function (not main).
// Print to the screen EXACTLY as follows, substituting x for the user number and the answer for factorial: "The factorial of {x} is {factorial}."


import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int factorial = computeFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }

    public static int computeFactorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}

// In them instructions it don't say to comment code
// sooooooo.................
// Here is the code, commented

// import java.util.Scanner;
// public class Factorials {
    // public static void main(String[] args) {
        // Scanner numEntered = new Scanner(System.in);
        // System.out.print("Enter a number: ");

        // int n, c, fact=1;
        // n = numEntered.nextInt();

        // for ( c = 1 ; c <= n ; c++ )
            // fact = fact * c;

        // System.out.println("Factorial of " + n + " is = " + fact);
    // }
// }
