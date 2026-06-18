/*Question 38: Write a Java program to check whether a given year is a leap year or not.
Input:
Year = 2024

Output:
Leap Year

Explanation:
A leap year is divisible by 4.
However, if divisible by 100, it must also be divisible by 400 to be a leap year.*/

import java.util.*;
public class LeaporNot{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter year");
		int year=in.nextInt();
		if(year%4==0){
			System.out.println("year is a leap year");
	}
	else{
		System.out.println("not leap year");
	}
	}	
}
		