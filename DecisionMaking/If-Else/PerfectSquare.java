/*Question 20: Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
Input:
Number = 49

Output
Perfect Square

Explanation:
Square root of 49 is 7, which is an integer.
Therefore, 49 is a Perfect Square.
If the square root contains a decimal value, then it is not a Perfect Square.*/

import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        
        
        double sqrt = Math.sqrt(n);
        
        
        if (sqrt == (int)sqrt) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }
}
