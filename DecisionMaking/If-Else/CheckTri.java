/*Question 3: Write a Java program to check whether a triangle is equilateral, isosceles or scalene.
Input:
A = 5, B = 5, C = 5

Output:
Equilateral

Explanation:
All sides equal ? Equilateral
Two sides equal ? Isosceles
All sides different ? Scalene*/
import java.util.*;
public class CheckTri{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter three side of triangle");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if (a==b&&b==c&&a==c){
			System.out.println("equilateral");
		}
		else if(a==b||b==c ||a==c){
			System.out.println("isosceles");
		}
		else{
			System.out.println("scalene");
		}
	}
}

		