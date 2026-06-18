/*Question 24: Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
Input:

Number = 145

Output:

Strong Number

Explanation:

1! + 4! + 5! = 1 + 24 + 120 = 145.
Since the sum equals the number, it is a Strong Number*/

import java.util.*;

public class StrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();
        
        int sum = 0;

        // Number che digits baher kadhnyasathi loop
        for (int temp = n; temp > 0; temp = temp / 10) {
            int rem = temp % 10; // Shevatcha digit kadhla (e.g., 5)
            
            int fact = 1;
            // Tyach digit cha factorial kadhla
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            
            sum = sum + fact; // Sum madhe add kela
        }

        // Final check sum ani original number sathi
        if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println("not strong number");
        }
    }
}


	