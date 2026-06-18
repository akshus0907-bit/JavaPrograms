/*Question 30: Write a java program to display 1 to nth Perfect Number
Input:

n = 2

Output:

6 

28

Explanation:

The first perfect number is 6.
The second perfect number is 28.
Both numbers are equal to the sum of their proper divisors.*/

import java.util.*;

public class PerfectNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == num) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
