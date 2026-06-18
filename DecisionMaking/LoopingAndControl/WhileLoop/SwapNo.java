/*Question 20: Write a java program to swap first and last digits of a number.
Input:

Number = 1234

Output:

Swapped Number = 4231

Explanation:

First digit (1) and last digit (4) are interchanged.
Middle digits remain the same.*/

import java.util.*;

public class SwapNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = in.nextInt();

        int original = n;

        // Last digit
        int last = n % 10;

        // First digit
        int first = n;
        while (first >= 10) {
            first = first / 10;
        }

        // Count digits
        int digits = (int) Math.log10(n);

        // Remove first and last digits
        int middle = n % (int)Math.pow(10, digits); // remove first
        middle = middle / 10; // remove last

        // Build swapped number
        int swapped = last * (int)Math.pow(10, digits) + middle * 10 + first;

        System.out.println("Before swapping: " + original);
        System.out.println("After swapping: " + swapped);
    }
}