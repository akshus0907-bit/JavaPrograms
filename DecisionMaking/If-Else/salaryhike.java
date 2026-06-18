/*Question 42: Employee salary hike based on performance and years of service:
? Input: Basic salary, Years of service, Performance rating (1–5)
? Logic:
? If rating >= 4 and service > 5 yrs ? 20% hike
? Else if rating >= 3 ? 10%
? Else ? 5%
? Output: New salary.
Input
Basic Salary
Years of Service
Performance Rating (1–5)

Example Input:
Basic Salary = 30000
Years of Service = 6
Rating = 4

Logic
If rating ? 4 and service > 5 years ? 20% hike
Else if rating ? 3 ? 10% hike
Else ? 5% hike

Output
New Salary = 36000

Explanation
Since rating is 4 and service is more than 5 years, employee gets 20% hike.
20% of 30000 = 6000
New Salary = 30000 + 6000 = 36000*/

import java.util.*;
public class salaryhike{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter basic salary ,years of service,rating");
		int salary=in.nextInt();
		int year=in.nextInt();
		int rating=in.nextInt();
		int hike=0;
		if(rating>=4 && year>5){
			hike=(salary*20)/100;
			int newSalary=salary+hike;
			System.out.println(newSalary);
		}
		else if(rating>=3&& year>5){
			hike=(salary*10)/100;
			int newSalary=salary+hike;
			System.out.println(newSalary);
		}
		else{
			System.out.println("invalid input");
		}
	}
}
			