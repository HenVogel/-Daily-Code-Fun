import java.util.Scanner;

public class Method {    
    public static void processNumbers(int num1, int num2, int num3) {
        int sum = sumNumbers(num1, num2, num3);
        int max = maxNumbers(num1, num2, num3);
        int min = minNumbers(num1, num2, num3);
        double average = averageNumbers(sum);
        boolean allPositive = positiveNumbers(num1, num2, num3);
        
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }

    public static void getUserInput() {
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter 3 numbers: ");
            
            System.out.print("Enter number 1: ");
            int num1 = userInput.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = userInput.nextInt();
            System.out.print("Enter number 3: ");
            int num3 = userInput.nextInt();
            
            processNumbers(num1, num2, num3);
        }
    }

        public static int sumNumbers(int num1, int num2, int num3) {
            int sum = num1 + num2 + num3;
            return sum;
        }

        public static int maxNumbers(int num1, int num2, int num3) {
            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            return max;
        }   
 
        public static int minNumbers(int num1, int num2, int num3) {
            int min = num1;
            if (num2 < min) {
                min = num2;
            }
            if (num3 < min) {
                min = num3;
            }
            return min;
        }
 
        public static double averageNumbers(int sum) {
            double average = sum / 3.0;
            return average;
        }
 
        public static boolean positiveNumbers(int num1, int num2, int num3) {
            boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
            return allPositive;
        }
 
    public static void main(String[] args) {
        getUserInput();
    }
}
