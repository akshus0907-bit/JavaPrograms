/*Question 21: Write a java program to check whether a number is neon or not neon without using loop.
Input:
Number = 9

Output
Neon Number

Explanation:
Square of 9 = 9 × 9 = 81
Sum of digits of 81 = 8 + 1 = 9
Since sum (9) equals the original number (9), it is a Neon Number.*/

import java.util.*;
public class NeonNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		
		int square=n*n;
		int first=square%10;
		int second=square/10;
		
		int sum=first+second;
		
		if (n==sum){
			System.out.println("neon number");
		}
		else{
			System.out.println("not neon number");
		}
	}
}
		