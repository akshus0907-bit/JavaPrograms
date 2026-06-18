/*Question 38: Check whether the month number is valid and display season.

   Input: 1 to 12
   Logic: if-else if to map to Winter/Spring/Summer/Autumn.
   Output: Season.
Input:
Month Number = 4
Output:
Season: Spring

Explanation:
The program checks the month number and maps it to a season as follows:
December (12), January (1), February (2) ? Winter
March (3), April (4), May (5) ? Spring
June (6), July (7), August (8) ? Summer
September (9), October (10), November (11) ? Autumn*/

import java.util.*;
public class Season{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter Month Number");
		int month=in.nextInt();
		if(month==12||month==1||month==2){
			System.out.println("winter");
		}
		else if(month==3||month==4||month==5){
			System.out.println("Spring");
		}
		else if(month==6||month==7||month==8){
			System.out.println("summar");
		}
		else if(month==9||month==10||month==11){
			System.out.println("autumn");
		}
		else{
			System.out.println("invalid input");
		}
	}
}
		
