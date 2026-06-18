/*Question 8: Write a Java program to check whether a year is a leap year or not.
Input:
Year = 2024

Output:
Leap Year

Explanation:
A year is leap if:

Divisible by 4

Not divisible by 100 unless divisible by 400*/
import java.util.*;
public class leapyr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter year=");
		int year=in.nextInt();
		if(year%400==0 ||year%4==0){
			System.out.println("Leap year");
		}
		else{
			System.out.println("not leap year");
		}
	}
}


