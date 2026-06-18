/*Question 45: Write a Java program to find the minimum between two numbers.
Input:
A = 8
B = 12

Output:
Minimum = 8

Explanation:
The program compares both numbers and prints the smaller one.*/

import java.util.*;
public class Min{
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		String d =(a<b)? " minimum="+a:"minimum="+b;
		System.out.println(d);
	}
}