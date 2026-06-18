/*Question 18: Write a Java program to convert days into years, months, and weeks.
Input:
Days = 400

Output:
Years = 1
Months = 1
Weeks = 1

Explanation:
1 year = 365 days.
After subtracting 365 days, the remaining days are divided into months (30 days each) and weeks (7 days each).*/
import java.util.*;
public class Days{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("enter days:=");
		int d =in.nextInt();
		int year =d/365;
		int rem=d%365;
		int months=rem/30;
		int week=d%7;
		System.out.println("year ="+year+ "\nmonths ="+months+ "\nweek="+week);
		
	}
}