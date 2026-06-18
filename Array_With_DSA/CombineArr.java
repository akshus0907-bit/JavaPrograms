/*Question 28: Write a java program to find the union array of two unsorted arrays.
Input:
Array1 = [1, 2, 3]
Array2 = [2, 3, 4, 5]

Output:
Union Array = [1, 2, 3, 4, 5]

Explanation:
Combine both arrays and remove duplicate elements so that each value appears only once.*/

import java.util.*;

public class CombineArr {
    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = [5];
        int result[] = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            result[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (b[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[k++] = b[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}