/*Question 50: Task: Identify the first digit in a number that does not repeat anywhere else, using only loops.
Example: n = 1213451 ? first non-repeating digit = 2.
Input:
n = 1213451

Output:
2

Explanation:
Digit 2 appears only once and is the first non-repeating digit.*/

import java.util.*;
public class Q50{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int n=in.nextInt();

        // 🔁 Reverse number (ADD केले)
        int rev = 0;
        int temp = n;
        while(temp > 0){
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }

        temp = rev;   // 🔥 change

        while(temp > 0){
            int digit = temp % 10;

            int temp2 = rev;   // 🔥 change
            int count = 0;

            while(temp2 > 0){
                if(temp2 % 10 == digit){
                    count++;
                }
                temp2 = temp2 / 10;
            }

            if(count == 1){
                System.out.println(digit);  // ✔️ digit print
                break;
            }

            temp = temp / 10;   // 🔥 ADD केले (very important)
        }
    }
}
			