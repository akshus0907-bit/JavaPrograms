/*Question 32: Write a Java program to check whether a triangle is valid or not using its three angles.
Input:
Angle1 = 60
Angle2 = 60
Angle3 = 60

Output:
Valid Triangle

Explanation:
A triangle is valid only if the sum of all three angles is exactly 180°.
60 + 60 + 60 = 180, so it is valid*/
import java.util.*;
public class TriangleValid{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter Angle1=:");
		int a=in.nextInt();
		System.out.println("enter Angle2=:");
		int a=in.nextInt();
		System.out.println("enter Angle3=:");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int sum=a+b+c;
		String check=(sum==180)?"triangle is valid":"tiangle is not valid";
		System.out.println(check);
	}
}