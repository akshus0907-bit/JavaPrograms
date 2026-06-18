/*Question 2: Write a Java program to create an Employee class and calculate yearly salary using constructor.

Description: Create Employee class with empId, empName and monthlySalary. 
Use constructor to initialize values. Calculate yearly salary (monthlySalary × 12) and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000

EXPLANATION:
Create Employee class with fields empId, empName, monthlySalary. 
Use constructor public Employee(int empId, String empName, int monthlySalary) to initialize. 
Calculate yearly salary as monthlySalary * 12 in constructor or display method. 
Display employee name and yearly salary.*/

import java.util.*;
public class Employee{
	private int Id;
	private String Name;
	private int MSalary;
	
	
	
	Employee(int i,String n,int m){
		Id=i;
		Name= n;
		MSalary=m;
		 
		
	}
	void display(){
		int YSalary=MSalary*12;
		System.out.println("Employee name="+Name+"\nYearly Salary="+YSalary);
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter name");
		String name=in.nextLine();
		
		System.out.println("enter monthly salary");
		int m=in.nextInt();
		Employee e=new Employee(id,name,m);
		
		e.display();
	}
}
	

