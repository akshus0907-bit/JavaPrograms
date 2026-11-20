/*Question 67: Count All Pairs in Array
Description:
Given array of size n, print all possible pairs (i,j).
Input:
n = 3

Output:
(1,2) (1,3) (2,3)

Explanation:
Nested loops.
Time Complexity: O(n²)*/

import java.util.*;
public class Q67{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size");
		int n=in.nextInt();
		int a[]=new int[n];
		 System.out.println("Enter elements");

        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				System.out.println(a[i]+ " " +a[j]);
			}
		}
	}
}

