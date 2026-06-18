/*Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
Input:
123

Output:
4

Explanation:
First digit = 1
Last digit = 3
Sum = 1 + 3 = 4.*/

import java.util.*;
public class Digit{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter three digit number:");
		int n=in.nextInt();
		int first=(n/100);
		int last=(n%10);
		int sum=first+last;
		System.out.println("sum of first and last digit is:="+sum);
	}
}