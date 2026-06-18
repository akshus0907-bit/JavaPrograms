/*Question 30: Write a java program to enter month number between(1-12) and print number of days in month using if else. How to print the number of days in a given month using if else in java programming
Input:
Month = 2

Output
28 or 29 Days

Explanation:
January, March, May, July, August, October, December ? 31 days

April, June, September, November ? 30 days

February ? 28 days (29 in leap year)*/

import java.util.*;
public class Month{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter month");
		int month=in.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10 ||month==12){
			int days=31;
			System.out.println(days);
		}
		else if(month==4||month==6||month==9||month==11){
			int days=30;
			System.out.println(days);
		}
		else {
			
			System.out.println("days =28 or 28");
		}
	}
}
		
			