/*Question 25: Write a Java program to check whether a number is palindrome or not.
Input:
121

Output:
Palindrome

Explanation:
A palindrome number remains the same when reversed.
Since 121 reversed is also 121, it is a palindrome.*/

import java.util.*;
public class palindrome{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=in.nextInt();
		int rev=0,r,temp;
		temp=n;
		while(n!=0){
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
	}
	 String s=(rev==temp)?"number is palindrome":"number is not palindrome";
	 System.out.println(s);
 }
}