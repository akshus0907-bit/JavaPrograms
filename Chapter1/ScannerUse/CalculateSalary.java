/*Question 28: Write a Java program to calculate the net salary of an employee.
Input:
Basic = 20000
HRA = 10%
DA = 5%
Tax = 2%

Output:
Net Salary = 22600

Explanation:
HRA and DA are calculated as percentages of the basic salary and added to it.
Tax is deducted after adding allowances to compute the final net salary.*/

import java.util.*;
public class CalculateSalary{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter basic salary=:");
		int salary=in.nextInt();
		int hra=(salary*10)/100;
		int da=(salary*5)/100;
		int tax=(salary*2)/100;
		System.out.println(tax);
		int totalSalary=salary+hra+da-tax;
		System.out.println("net salary is ="+totalSalary);
	}
}