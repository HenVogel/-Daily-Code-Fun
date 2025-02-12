import java.util.Scanner;

public class Arrays {
    //Task 1: Declare an Array
    //Declare an integer array named numbers with a size of 5.
    //Print all elements of the array to show their default values.
    
    public static void array1() {
        int[] numbers = new int[5];
        System.out.println("ARRAY 1:");
        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
        System.out.println("Element 4: " + numbers[3]);
        System.out.println("Element 5: " + numbers[4]);
        System.out.println("");
    }

    //Task 2: Declare an Array and fill the values in multiple lines
    //Declare an integer array named numbers with a size of 5.
    //Assign the values 21, 12, 22, 11, 2 to the array using separate assignment statements.
    //Print the complete array.

    public static void array2() {
        int[] numbers = new int[5];
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;

        System.out.println("ARRAY 2:");
        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
        System.out.println("Element 4: " + numbers[3]);
        System.out.println("Element 5: " + numbers[4]);
        System.out.println("");
    }

    //Task 3: Declare an Array and fill the values in one line
    //Declare and initialize an integer array named numbers with a size of 5 in one line.
    //Assign the values 21, 12, 22, 11, 2 directly.
    //Print the complete array.

    public static void array3() {
        int[] numbers = {21, 12, 22, 11, 2};

        System.out.println("ARRAY 3:");
        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
        System.out.println("Element 4: " + numbers[3]);
        System.out.println("Element 5: " + numbers[4]);
        System.out.println("");
    }

    //Task 4: Declare an Array and fill the values using a for loop
    //Declare an integer array named numbers with a size of 5.
    //Use a for loop to populate the array starting with 3, then fill it with increasing multiples of 3.
    //Print the complete array.

    public static void array4() {
        int[] numbers = new int[5];

        for (int i = 1; i <= 5; i++) {
            numbers[i - 1] = i * 3;
        }

        System.out.println("Array 4:");
        System.out.println("Element 1: " + numbers[0]);
        System.out.println("Element 2: " + numbers[1]);
        System.out.println("Element 3: " + numbers[2]);
        System.out.println("Element 4: " + numbers[3]);
        System.out.println("Element 5: " + numbers[4]);
        System.out.println("");
    }

    //Task 5: Declare an Array and fill the values using a for loop, char edition
    //Declare a char array named charArray with a size of 5.
    //Set the first element to 'A'.
    //Use a for loop to fill the array with the next respective letters, increasing by 2 each time. You must use math, you cannot hard code.
    //Print the complete array.

    public static void array5() {
        char[] charArray = new char[5];

        charArray[0] = 'A';

        for (int i = 1; i < 5; i++){
            charArray[i] = (char)((int)charArray[i-1]+2);
        }

        System.out.println("Char Array:");
        System.out.println("Element 1: " + charArray[0]);
        System.out.println("Element 2: " + charArray[1]);
        System.out.println("Element 3: " + charArray[2]);
        System.out.println("Element 4: " + charArray[3]);
        System.out.println("Element 5: " + charArray[4]);
        System.out.println("");
    }

    //Task 6: User-Defined Array with Random Values
    //Prompt the user to enter the size of the array.
    //Create an array of that size.
    //Fill it with random numbers between 1 and 100 using a for loop.
    //Print the array values.

    public static void array6() {

        System.out.print("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            numbers[i] = (int)(Math.random() * 100) + 1;
            System.out.println("Eelment " + i + ": " + numbers[i]);
        }

        input.close();
    }

    //Method to run this stuff
    public static void main(String[] args) {array1(); array2(); array3(); array4(); array5(); array6();}
}