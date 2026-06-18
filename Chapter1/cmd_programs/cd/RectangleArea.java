/*
Question 4: Write a Java program to enter length and breadth of a rectangle and calculate its area.
Input:
Length = 10
Breadth = 5

Output:
Area = 50

Explanation:
The area of a rectangle is calculated using the formula:
Area = Length × Breadth
So, 10 × 5 = 50. */

public class RectangleArea{
	public static void main(String x[]){
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		
		float area = a*b;
		System.out.println("Area of rectangle is ="+area);
		
	}
	
}