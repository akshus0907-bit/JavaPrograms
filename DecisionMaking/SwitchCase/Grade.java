/*Question 54: Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
? A: Excellent
? B: Good
? C: Average
? D: Poor
? F: Fail
Input:
Grade = A

Output:
Excellent

Explanation:
The switch matches grade ‘A’ and prints “Excellent”. Each grade has a specific remark.

Input:
Grade = D

Output:
Poor

Explanation:
Grade ‘D’ matches the case and prints “Poor”.*/

import java.util.*;
public class Grade{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter grade");
		char grade=in.next().charAt(0);
		
		switch(grade){
			case 'A':
			System.out.println("Excellent");
			break;
			case 'B':
			System.out.println("Good");
			break;
			case 'C':
			System.out.println("Average");
			break;
			case 'D':
			System.out.println("Poor");
			break;
			case 'F':
			System.out.println("Fail");
			break;
			default:
			System.out.println("invalid input");
		}
	}
}