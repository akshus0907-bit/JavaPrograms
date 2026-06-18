/*Question 43: Write a program in java to find a subarray with given sum from the given array?
Input:
Array = [3, 4, -7, 1, 3, 3, 1, -4]
Target Sum = 7

Output:
Subarrays = [3,4], [3,4,-7,1,3,3], [1,3,3], [3,3,1]

Explanation:
Check all contiguous subarrays and calculate their sums to identify those equal to the target value.*/

import java.util.*;
public class SubArrSum{
	public static void  main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		//int n=in.nextInt();
		int a[]=new int[8];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter target sum=");
		int sum=in.nextInt();
		for(int i=0;i<a.length;i++){
			int currentsum=0;
			for(int j=i;j<a.length;j++){
				currentsum=currentsum+a[j];
				if(currentsum==sum){
					System.out.print("subArray=");
					for(int k=i;k<=j;k++){
						System.out.println(a[k]);
					}
				}
			}
		}
	}
}
