/*Question 73: Sum of All Subarrays
Description:

Given an array of size n, calculate the sum of all possible subarrays.

A subarray is a contiguous part of an array.
Input:
n = 3
Array = [1, 2, 3]

Output:
Subarrays:
[1] ? 1
[1,2] ? 3
[1,2,3] ? 6
[2] ? 2
[2,3] ? 5
[3] ? 3

Total Sum = 20

Explanation:
We use two loops:
First loop selects starting index.
Second loop selects ending index and keeps adding elements.

Number of subarrays = n(n+1)/2
For n=3 ? 6 subarrays.

Time Complexity: O(n²)
Because two nested loops generate all subarra*/

import java.util.*;
public class Q73{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int totalsum=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int sum=0;
			System.out.print("[");
			for(int k=i;k<=j;k++){
				 sum=sum+a[k];
				System.out.print(sum);
			}
		
			
			totalsum = totalsum + sum;
			System.out.println("] -> " + sum);
		}
	}
	    System.out.println("Total Sum = " + totalsum);
	}
}


