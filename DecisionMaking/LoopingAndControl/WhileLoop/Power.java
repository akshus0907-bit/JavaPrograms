/*Question 16: Write a java program to find power of a number.
Input:

Base = 2
Exponent = 3

Output:

Result = 8

Explanation:

2 raised to the power 3 means 2 × 2 × 2.
The result is 8.*/

import java.util.*;
public class Power{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter base and exponent");
		int base=in.nextInt();
		int exponent=in.nextInt();
		while(n>0){
		int result= (int) Math.pow(base, exponent);
		System.out.println("result="+result);
		}
	}
}