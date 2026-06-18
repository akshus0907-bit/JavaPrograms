/*Question 19: Write a java program to find the sum of the first and last digit of a number.
Input:

Number = 1234

Output:

Sum = 5

Explanation:

First digit = 1
Last digit = 4
Sum = 1 + 4 = 5.*/

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
        
        
        int last = n % 10;
        int first = n;

        while (first >= 10) {
            first = first / 10;
        }
		int sum= first+last;

        System.out.println(sum);
        
        
        
    }
}
