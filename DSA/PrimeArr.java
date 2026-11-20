/*Question 37: Count the number of prime numbers in an array.
Input:
Array = [2, 5, 6, 9, 11]

Output:
Count of Prime Numbers = 3

Explanation:
Check each element to see if it is divisible only by 1 and itself and count such numbers.*/

import java.util.*;

public class PrimeArr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Step 1: Array declare करा
        int a[] = new int[5];

        System.out.println("Enter 5 array elements:");

        // Step 2: Array input घ्या
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }

        // Step 3: prime count साठी variable
        int count = 0;

        // Step 4: प्रत्येक element check करा
        for (int i = 0; i < 5; i++) {

            int num = a[i];  // current number
            boolean isPrime = true; // assume prime आहे

            // Step 5: 1 किंवा 0 असेल तर prime नाही
            if (num <= 1) {
                isPrime = false;
            } 
            else {
                // Step 6: 2 पासून num-1 पर्यंत check करा
                for (int j = 2; j < num; j++) {

                    // जर number divide झाला तर prime नाही
                    if (num % j == 0) {
                        isPrime = false;
                        break; // पुढे check नको
                    }
                }
            }

            // Step 7: जर prime असेल तर count वाढवा
            if (isPrime) {
                count++;
            }
        }

        // Step 8: final output
        System.out.println("Prime numbers count = " + count);
    }
}