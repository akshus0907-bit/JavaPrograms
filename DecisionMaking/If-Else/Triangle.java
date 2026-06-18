/*Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side.*/
import java.util.*;
public class Triangle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a three side of trianle");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		
		if(a+b>c && b+c>a && a+c>b){
			System.out.println("triangle is valid");
		}
		else {
			System.out.println("triangle is not valid");
		}
	}
}