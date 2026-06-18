/*Question 18: Write a java program to find the first and last digit of a number.
Input:

Number = 1234

Output:

First Digit = 1
Last Digit = 4

Explanation:

Last digit is found using number % 10.
First digit is found by dividing the number until it becomes a single digit.*/

import java.util.*;

public class FindDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
        
        
        int last = n % 10;
        int first = n;

        while (first >= 10) {
            first = first / 10;
        }

        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
        
        in.close();
    }
}
