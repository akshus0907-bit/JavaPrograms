/*Question 52: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. 
Consider leap year for February.
Input:
Month = 2
Year = 2024

Output:
Number of days = 29

Explanation:
The program uses a switch case for month numbers. For February (month 2), 
it checks whether the given year is a leap year. Since 2024 is a leap year, February has 29 days*/

import java.util.*;
public class Months{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter month and year");
		int month=in.nextInt();
		int year=in.nextInt();
		
		switch(month){
			case 1: 
			System.out.println("number of days=31");
			break;
			case 2:
			if(year%4==0 ||year%400==0){
				System.out.println("number of days=29");
			}
			else{
				System.out.println("number of days=28");
			}
			break;
			case 3:
			System.out.println("number of days =31");
			break;
			case 4:
			System.out.println("number of days=30");
			break;
			case 5:
			System.out.println("number of days=31");
			break;
			case 6:
			System.out.println("number of days=30");
			break;
			case 7:
			System.out.println("number of days=31");
			break;
			case 8:
			System.out.println("number of days=31");
			break;
			case 9:
			System.out.println("number of days=30");
			break;
			case 10:
			System.out.println("number of days=31");
			break;
			case 11:
			System.out.println("number of days=30");
			break;
			case 12:
			System.out.println("number of days=31");
			break;
			default:
			System.out.println("invalid input");
		}
	}
}
			