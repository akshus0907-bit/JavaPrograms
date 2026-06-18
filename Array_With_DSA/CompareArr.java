/*Question 22: Write a Java program to check whether two integer arrays are equal.
Two arrays are considered equal if:
Input:
Array1 = [10, 20, 30, 40]
Array2 = [10, 20, 30, 40]

Output:
Arrays are equal.

Explanation:
First compare the lengths of both arrays and if they are equal then compare elements at each index; 
if all elements match the arrays are equal otherwise they are not.*/

import java.util.*;

public class CompareArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a[] = new int[4];
        int b[] = new int[4];
        
        System.out.println("Enter 4 elements for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Enter 4 elements for second array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }

        boolean isEqual = true;

        if (a.length != b.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
