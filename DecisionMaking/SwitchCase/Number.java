/*Question 57: Create a Java program using switch to convert a given number (1-5) to its word equivalent (One, Two, ..., Five). 
If the number is not between 1 and 5, display “Invalid number”.
Input:
Number = 3

Output:
Three

Explanation:
Switch case 3 matches and prints “Three”. Default handles invalid numbers.

Input:
Number = 9

Output:
Invalid Number
Explanation:
Since 9 is outside 1–5, default case runs.*/

import java.util.*;
public class Number{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		switch(n){
			case 1:
			System.out.println("one");
			break;
			case 2:
			System.out.println("two");
			break;
			case 3:
			System.out.println("three");
			break;
			case 4:
			System.out.println("four");
			break;
			case 5:
			System.out.println("five");
			break;
			default:
			System.out.println("invalid input");
		}
	}
}