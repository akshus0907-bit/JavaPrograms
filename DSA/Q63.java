/*Question 63: Sum of Array Elements
Description:
Given an array of n elements, compute the sum.
Input:
n = 5
Array: [1,2,3,4,5]

Output:
Sum = 15

Explanation:
Each element is visited once.

Time Complexity: O(n)*/

import java.util.*;
public class Q63{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element in aaray");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter aaray element ");
		
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
	System.out.println(sum);
	}
}
