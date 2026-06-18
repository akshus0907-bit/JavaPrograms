/*Question 33: Write a Java program to implement a Loan Eligibility Checker using POJO class.
Create a POJO class Loan with variables age and salary.
Determine loan eligibility:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Age : 30
Enter Salary : 28000

Output:
Age : 30
Salary : 28000
Loan Status : Eligible

Explanation:
A POJO class Loan has private fields: age and salary.
setAge(30) and setSalary(28000) store user input using setter methods.
Getter methods retrieve age and salary for the eligibility check.
Compound condition: if (age >= 21 && salary >= 25000) => Eligible.
Since age = 30 (>= 21) AND salary = 28000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This is a POJO-based implementation of loan eligibility with compound conditions.*/

import java.util.*;
public class LoanEligibility{
	private int Age;
	private double Salary;
	
	public void setAge(int a){
		Age=a;
	}
	public void setSalary(double s){
		Salary=s;
	}
	
	public int getAge(){
		return Age;
	}
	public double getSalary(){
		return Salary;
	}
	public String getStatus(){
		if(getAge()>=21 && getSalary()>=25000){
			return "Eligible";
		}
		else{
			return "not Eligible";
		}
	}
	public static void main(String[]args){
		LoanEligibility l=new LoanEligibility();
		Scanner in=new Scanner(System.in);
		System.out.println("enter Age");
		int Age=in.nextInt();
		System.out.println("enter salary");
		double Salary=in.nextDouble();
		
		l.setAge(Age);
		l.setSalary(Salary);
		
		System.out.println("-----------------------------------");
		System.out.println("Age="+l.getAge());
		System.out.println("Salary="+l.getSalary());
		System.out.println("Loan Status="+l.getStatus());
	}
}
