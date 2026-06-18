/*Question 47: Write a program in java to find the maximum for each and every contigious subarray of size k from a given array.
Input:
Array = [1, 3, 6, 21, 4, 9, 12, 3, 16, 10]
K = 4

Output:
Maximums = [21, 21, 21, 21, 12, 16, 16]

Explanation:
Slide a window of size K across the array and determine the maximum element 
within each window.*/

import java.util.*;
public class Q47{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element in array");
		int n=in.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter aaray element");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		int k=4;
		for(int i=0;i<=n-k;i++){
			int max=a[i];
		
		for(int j=i;j<i+k;j++){
			if(a[j]>max){
				max=a[j];
			}
		}
		System.out.println(max);
	}
}
}
