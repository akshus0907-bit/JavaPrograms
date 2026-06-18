/*Question 37: Compare two numbers: greater, smaller, or equal.

   Input: Two integers
   Logic: if-else if
   Output: Greater, smaller, or equal.
Input:
A = 25
B = 30
Output:
A is smaller than B
Explanation:
Use if-else to compare values.*/

import java.util.*;
public class CompareNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a>b){
			System.out.println("a is greater than b");
		}
		else{
			System.out.println("b is greater than a");
		}
	}
}