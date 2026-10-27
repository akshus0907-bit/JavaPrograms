/*Question 31: Replace First and Last Element with 0.
Asked In Practice assignment
Input:
Array = [5, 3, 7, 2]

Output:
Array = [0, 3, 7, 0]

Explanation:
Update the first and last positions of the array with 0 and leave the middle elements unchanged.*/


import java.util.*;

public class ReplaceWithZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i == a.length - 1) {
                a[i] = 0;
            }
        }

        System.out.println("Array after replacing first and last elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        in.close();
    }
}
