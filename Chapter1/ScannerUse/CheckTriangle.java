/*Question 33: Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
Input:
Side1 = 5
Side2 = 5
Side3 = 5

Output:
Equilateral Triangle

Explanation:
If all three sides are equal ? Equilateral.
If any two sides are equal ? Isosceles.
If all sides are different ? Scalene*/

import java.util.*;
public class CheckTriangle{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter side1,side2,side3:");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
	if(a==b&&b==c){
		System.out.println("Equilateral triangle");
	}
	else if(a==b ||a==c||b==c){
		System.out.println("Isosceles triangle");
	}
	else{
		System.out.println("Scalene triangle");
	}
	}
}
		
		
