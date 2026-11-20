/*Question 65: Count Digits in a Number
Description:
Given integer n, count number of digits using division by 10.
Input:
n = 12345

Output:
Digits = 5

Explanation:
Each step removes one digit.

Time Complexity: O(log n)*/
import java.util.*;
public class Q65{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
	
		int digit=0;
		while(n>0){
			n=n/10;
			digit++;
		}
		System.out.println("digit="+digit);
	}
}