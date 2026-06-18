/*Question 26: Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
Input:

Number = 9

Output:

Neon Number

Explanation:

9² = 81
8 + 1 = 9
Since the sum equals the number, it is a Neon Number.*/
import java.util.*;

public class NeonNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        
        int sum = 0;
        int square = n * n; 

      
        while (square > 0) {
            int digit = square % 10; 
            sum = sum + digit;       
            square = square / 10;    
        }

        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}

			