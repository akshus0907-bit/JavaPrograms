/*Question 14: Write a java program to check whether a number is palindrome or not.
Input:

Number = 121

Output:

Palindrome

Explanation:

The reversed number of 121 is also 121.
Since original and reversed numbers are equal, it is a palindrome.*/

import java.util.*;
public class PalindromeNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int r;
		int rev=0;
		int temp=n;
		int count=0;
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
			count++;
		}
		if(rev==temp){
			System.out.println("number is palindrome=");
		}
		else{
			System.out.println("number is not palindrome=");
		}
	}
}