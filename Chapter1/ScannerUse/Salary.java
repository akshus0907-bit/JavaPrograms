/*Question 44: Write a Java program to calculate gross salary based on basic salary conditions.
Input:
Basic Salary = 18000

Output:
Gross Salary = 34650

Explanation:
Gross salary is calculated by adding HRA and DA to the basic salary according to the given salary slab conditions.*/

import java.util.*;
public class Salary{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter basic salary");
		int s=in.nextInt();
		
		int hra=(s*40)/100;
		int da=(s*40)/100;
		
		int grossSalary=s+hra+da;
		System.out.println("gross Salary ="+grossSalary);
	}
}