// BEGIN
public class ThreeIsNotTheMagicNumber {
    public static void main(String[] args) {
        // Loop through numbers 1 to 20
        // FOR each number from 1 to 20 DO
        for (int i = 1; i <= 20; i++) {
            // IF number is divisible by 3 THEN
            // Skip this iteration
            if (i % 3 == 0) {
                // ELSE
                // Print the number
                continue;
            }
            // END IF
            System.out.println(i);

        // END FOR
        }
    }
// END
}