/*Question 35: Check whether a given employee is eligible for bonus:

Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus
Input:
Years of Service = 7
Salary = 50000

Output:
Bonus = 2500

Explanation:
If service > 5 years ? 5% bonus
5% of 50000 = 2500
If service ? 5 ? No Bonus*/

import java.util.*;
public class Bonus{
   public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter year of service and salary" );
		int service=in.nextInt();
		int salary=in.nextInt();
		if(service>5){
			int bouns=(salary*5)/100;
			System.out.println("bonus="+bouns);
		}
		else{
			System.out.println("no bonus");
		}
	}
}

		