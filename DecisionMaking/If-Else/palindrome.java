/*Question 22: Write a java program to check whether a number is palindrome or not.
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.*/

import java.util.*;
public class palindrome{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		int r,temp;
		int rev=0;
		int sum=0;
		temp=n;
		while(n!=0){
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		if(temp==rev){
			System.out.println("number is palindrome number");
		}
		else{
			System.out.println("not palindrome");
		}
	}
}
		