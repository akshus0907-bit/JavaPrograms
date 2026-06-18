/*Question 46: Write a Java program to find the miniimum between two numbers.
Input:
A = 6
B = 3
C = 9

Output:
Minimum = 3

Explanation:
The program compares all three numbers using conditional statements and prints the smallest value.*/

import java.util.*;
public class MaxNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter three number");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		String d=(a<b &&a<c) ?"minimum="+a:(b<c)?" minimum="+b:" minimum="+c;
		System.out.println(c);
	}
}