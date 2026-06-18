/*Question 54: Write a Java expression using arithmetic and assignment operators to calculate net salary.
Input:
Basic Salary = 35000
Tax Rate = 12%

Output:
Net Salary = 30800

Explanation:

Tax amount = (basicsalary*taxrate)/100;
Net Salary = 35000 - 4200 = 30800.*/

import java.util.*;
public class NetSalary{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter basic salary and Tax Rate");
		int a=in.nextInt();
		int b=in.nextInt();
		int TaxAmount=(a*b)/100;
		int NetSalary=a-TaxAmount;
		System.out.println("net salary is ="+NetSalary);
	}
}
