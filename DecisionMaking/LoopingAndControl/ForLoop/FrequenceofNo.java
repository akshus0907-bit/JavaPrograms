/*Question 34: Write a java program to find the frequency of each digit in a given integer.
Input:

Number = 112233

Output:

1 occurs 2 times
2 occurs 2 times
3 occurs 2 times

Explanation:

The program counts how many times each digit appears in the number.
Each digit is extracted and its count is increase*/


import java.util.*;
public class FrequenceofNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();

      
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            int temp = n;

            
            while (temp > 0) {
                int digit = temp % 10; 
                if (digit == i) {
                    count++;
                }
                temp = temp / 10; 
            }

          
            if (count > 0) {
                System.out.println(i + "  occurs=" + count+ " time" );
            }
        }
         
        if (n == 0) {
            System.out.println("0 occurs 1 times");
        }
    }
}
