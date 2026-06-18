/*Question 50: Write a Java program to check whether the absolute difference between two numbers is greater than 10.
Input:
m = 25
n = 12

Output:
Difference is greater than 10

Explanation:
Absolute difference = |25 ? 12| = 13.
Since 13 is greater than 10, the condition is true*/

import java.util.*;
public class DiffinNumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int n=in.nextInt();
		int b=in.nextInt();
		int AbsoluteDifference=n-b;
		if(AbsoluteDifference>10){
			System.out.println("Difference is greater than 10  = "+AbsoluteDifference);
		}
	}
}
