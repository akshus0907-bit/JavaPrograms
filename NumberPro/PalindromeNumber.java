/* Palindrome Number
Question: Write a Java program to check whether a number is a Palindrome.

Meaning: A number is a palindrome if it remains the same when its digits are reversed.

Example: 121 reversed is 121.*/

import java.util.*;
public class PalindromeNumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		int temp=n;
		int rev=0;
		while(temp>0){
			int digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		if(n>0 && rev==n)
			System.out.println("number is paindrome");
		else{
			System.out.println("number is not palindrome");
		}
	}
}