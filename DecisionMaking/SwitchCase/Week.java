/*Question 31: Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print 
day of week using if else in java programming.
Input:
Week Number = 3
Output:
Wednesday

Explanation:
If week number is:
1 ? Monday
2 ? Tuesday
3 ? Wednesday
4 ? Thursday
5 ? Friday
6 ? Saturday
7 ? Sunday

If the input is not between 1–7, print Invalid Week Number.*/

import java.util.*;
public class Week{
	public static void main(){
		Scanner in=new Scanner(System.in);
		System.out.println("enter week number");
		int week=in.nextInt();
		 switch(week){
		 case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("invalid input");
	}
	}
	
}

