/*Question 29: Write a java program to display 1 to nth Prime Number.
Input:

n = 5

Output:

2 3 5 7 11

Explanation:

Prime numbers are numbers divisible only by 1 and themselves.
The first 5 prime numbers are 2, 3, 5, 7, and 11.*/
import java.util.*;

public class PrimeDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();

        int found = 0; 

        
        for (int num = 2; found < n; num++) {
            int c = 0; 

           
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c++; 
                }
            }
            if (c == 2) {
                System.out.print(num + " ");
                found++; 
            }
        }
    }
}
