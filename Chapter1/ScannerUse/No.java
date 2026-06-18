/*Question 47: Write a Java program to find the minimum among three numbers.
Input:
A = 14
B = 9

Output:
Maximum = 14

Explanation:
The program compares both numbers and prints the larger value.*/

import java.util.*;
public class No{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
			System.out.println("enter two number");
			int a=in.nextInt();
			int b=in.nextInt();
			String d=(a<b)?"minimum = "+a:"minimum ="+b;
		System.out.println(d);
		}
	}