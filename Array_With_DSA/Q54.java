/*Question 54: Given an array of integers nums and an integer target, return indices
of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the
same element twice.

You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

import java.util.*;
public class Q54{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter number of element in array");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int sum=0;
		int target=9;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==target){
					System.out.println("["+i+" " +j+ "]");
				}
			}
		}
	}
}	


