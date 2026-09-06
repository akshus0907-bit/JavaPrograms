/*Question 4: Write a Java program to swap two Integer values using autoboxing and unboxing.
Asked In Practice Assignment
Input:
Enter first number: 25
Enter second number: 75

Output:
Before swapping: 25 75
After swapping: 75 25

Explanation:
Read two numbers as primitive int. Assign to Integer objects (autoboxing occurs). To swap, convert (unbox) to primitive variables, use temporary variable to hold one value, then exchange. Display before and after values. Autoboxing allows seamless conversion int ? Integer, unboxing allows Integer ? int.*/

import java.util.*;
public class SwapNum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter 2 numbers");
		int  a=in.nextInt();
		int  b=in.nextInt();
		
		
		Integer e=a;
		Integer g=b;
		System.out.println("before swaping"+a+ " "+b);
		
		
		int x=e;
		int y=g;
		
		int temp =x;
		x=y;
		y=temp;
		
		e=x;
		g=y;
		
		
		System.out.println("after swaping"+x+" "+y);
		
	}
		}
		
		