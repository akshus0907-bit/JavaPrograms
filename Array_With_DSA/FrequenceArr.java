/*Question 27: Write a java program to count the frequency of each element in a given array.
Input:
Array = [1, 2, 2, 3, 3, 3, 4]

Output:
1 ? 1 time
2 ? 2 times
3 ? 3 times
4 ? 1 time

Explanation:
For each element in the array, count the number of occurrences by comparing it with all other elements.*/

import java.util.*;

public class FrequenceArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array element");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;

            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            System.out.println(a[i] + " -> " + count + " times");
        }
    }
}