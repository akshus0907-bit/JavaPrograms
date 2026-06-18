/*Question 27: Write a Java program to implement an Employee Salary Processor using POJO class.
Create a POJO class Employee with variables empId, basicSalary, and bonus.
Using getter and setter methods, calculate:
- Total Salary = basicSalary + bonus
- If salary > 50000 => High Salary
- Otherwise => Normal Salary
Input:
Enter Employee Id : 201
Enter Basic Salary : 40000
Enter Bonus : 15000

Output:
Employee Id : 201
Total Salary : 55000
Category : High Salary

Explanation:
A POJO class Employee has private fields: empId, basicSalary, bonus.
Setter methods store user-entered values. Getter methods retrieve them.
Total Salary = basicSalary + bonus = 40000 + 15000 = 55000.
Condition: if (totalSalary > 50000) => High Salary, else => Normal Salary.
Since 55000 > 50000, Category = High Salary.
This program demonstrates POJO encapsulation combined with business salary logic.*/

import java.util.*;
public class Employee{
	private int EmpId;
	private  int BasicSalary;
	private int Bonus;
	
	public void setEmpId(int e){
		EmpId=e;
	}
	public void setBasicSalary(int b){
		BasicSalary=b;
	}
	public void setBonus(int c){
		Bonus=c;
	}
	public int getEmpId(){
		return EmpId;
	}
	public int getBasicSalary(){
		return BasicSalary;
	}
	public int getBonus(){
		return Bonus;
	}
	public int getTotalSalary(){
		int totalSalary;
		totalSalary=BasicSalary+Bonus;
		return totalSalary;
	}
	public String getCategory(){
		String category;
		if(getTotalSalary()>=50000){
			category="high";
		}
		else{
			category="normal Salary";
		}
		return category;
	}
	public static void main(String[]args){
		Employee e=new Employee();
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter id");
		int EmpId=in.nextInt();
		System.out.println("enter basic salary");
		int BasicSalary=in.nextInt();
		System.out.println("enter bonus");
		int Bonus=in.nextInt();
		e.setEmpId(EmpId);
		e.setBasicSalary(BasicSalary);
		e.setBonus(Bonus);
		System.out.println("-------------------------------------");
		System.out.println("employee Id= "+e.getEmpId());
		System.out.println("Total Salary="+e.getTotalSalary());
		System.out.println("Category=    "+e.getCategory());
	}
}
			
