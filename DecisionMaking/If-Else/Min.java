/*Question 15: Write a java program to find the minimum between two numbers.
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum.*/

import java.util.*;
public class Min{
	public static void main(String[]arsg){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		
		if(a<b){
			System.out.println("min="+a);
		}
		else{
			System.out.println("min="+b);
		}
	}
}