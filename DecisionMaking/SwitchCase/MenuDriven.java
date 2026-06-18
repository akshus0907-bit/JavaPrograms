/*Question 62: Write a menu-driven program in java using switch case.
          1.Addition
          2.Subtraction
          3.Multiplication
          4.Division
Input:
Choice = 3
Number1 = 6
Number2 = 4

Output
Multiplication = 24

Explanation:
Choice 3 performs multiplication of two numbers*/

import java.util.*;
public class MenuDriven{
	public static void main(String[]ags){
		Scanner in=new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Mltiplication\n4.Division");
		System.out.println("enter a choice");
		int choice=in.nextInt();
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		switch(choice){
			case 1:
			System.out.println("addition="+(a+b));
			break;
			case 2:
			System.out.println("subtractio="+(a-b));
			break;
			case 3:
			System.out.println("Multiplication="+(a*b));
			break;
			case 4:
			System.out.println("Division="+(a/b));
			break;
			default:
			System.out.println("invalid input");
		}
	}
}