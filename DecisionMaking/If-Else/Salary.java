/*Question 14: Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
                  Basic Salary <= 10000 : HRA = 20%, DA = 80%
                  Basic Salary <= 20000 : HRA = 25%, DA = 90%
                   Basic Salary > 20000 : HRA = 30%, DA = 95%
Input:
Basic Salary = 15000

Output
Gross Salary = 32250

Explanation:
Since 15000 ? 20000:
HRA = 25% of 15000 = 3750
DA = 90% of 15000 = 13500

Gross Salary = 15000 + 3750 + 13500 = 32250*/

import java.util.*;
public class Salary{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter basic salary");
		int salary=in.nextInt();
		int hra,da;
		int grossSalary;
		if(salary<=10000){
			hra=(salary*20)/100;
			da=(salary*80)/100;
			grossSalary=salary+hra+da;
			System.out.println(" grossSalary=:"+grossSalary);
		}
		else if(salary<=20000){
			hra=(salary*25)/100;
			da=(salary*90)/100;
			grossSalary=salary+hra+da;
			System.out.println(" grossSalary=:"+grossSalary);
		}
		else if(salary>20000){
			hra=(salary*30)/100;
			da=(salary*95)/100;
			grossSalary=salary+hra+da;
			System.out.println(" grossSalary=:"+grossSalary);
		}
		else{
			System.out.println("basis salary"+salary);
		}
	}
}
			
			