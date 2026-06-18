/*Question 53: You are given a large integer represented as an integer array digits,
 where each digits[i] is the ith digit of the integer. The digits are ordered from 
 most significant to least significant in left-to-right order. The large integer 
 does not contain any leading 0's.Increment the large integer by one and return the 
 resulting array of digits.
 
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].*/

import java.util.*;
public class Q53{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element");
		int n=in.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		
		for(int i=a.length-1;i>=0;i--){
			if(a[i]!=9){
				a[i]=a[i]+1;
				break;
			}
			else{
				a[i]=0;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
