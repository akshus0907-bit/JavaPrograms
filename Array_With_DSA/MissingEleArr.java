/*Question 8: Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.*/

import java.util.*;

public class MissingEleArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Enter array elements:");

        
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        int max = 7;

        
        for (int i = 1; i <= max; i++) {
            boolean flag = false;   // 

            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag == false) {
                System.out.println(i);   
            }
        }
    }
}