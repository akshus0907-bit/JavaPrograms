/*Question 36: Write a Java program to implement Employee Salary Management using Array of Objects.
Create a POJO class Employee with attributes empId, empName, and salary.
Store details of N employees using array of objects.
Perform:
1. Display all employees
2. Find employee with highest salary
3. Find employee with lowest salary
Input:
Enter number of employees : 3

Enter Employee Id : 101
Enter Employee Name : Amit
Enter Salary : 45000

Enter Employee Id : 102
Enter Employee Name : Neha
Enter Salary : 52000

Enter Employee Id : 103
Enter Employee Name : Rahul
Enter Salary : 38000

Output:
Emp Id : 101 Name : Amit Salary : 45000
Emp Id : 102 Name : abc Salary : 52000
Emp Id : 103 Name : Rahul Salary : 38000

Highest Salary Employee : abc  - 52000
Lowest Salary Employee : Rahul - 38000

Explanation:
Employee emp[] = new Employee[3] creates an array of 3 Employee references.
Each emp[i] = new Employee() creates individual objects.
Setters store empId, empName, salary. Getters retrieve them for display.
Highest salary: loop through all, compare getSalary() => 52000 (abc).
Lowest salary: loop through all, compare getSalary() => 38000 (Rahul).
Array of objects is the correct way to store and process multiple records in Java.*/

import java.util.*;
public class EmployeeSalaryArr{
	private int Id;
	private String Name;
	private int Salary;
	
	public void setId(int e){
		Id=e;
	}
	public void setName(String n){
		Name=n;
	}
	public void setSalary(int s){
		Salary=s;
	}
	
	public int getId(){
		return Id;
	}
	public String getName(){
		return Name;
	}
	public int getSalary(){
		return Salary;
	}
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of employee");
		int n=in.nextInt();
		in.nextLine();
		EmployeeSalaryArr e[]=new EmployeeSalaryArr[n];
		for(int i=0;i<e.length;i++){
			e[i]=new EmployeeSalaryArr();
			System.out.println("enter employee id");
			int Id=in.nextInt();
			in.nextLine();
			System.out.println("enter employee name");
			String Name=in.nextLine();
			
			System.out.println("enter employee Salary");
			int Salary=in.nextInt();
			in.nextLine();
			
			e[i].setId(Id);
			e[i].setName(Name);
			e[i].setSalary(Salary);
		}
			System.out.println("---------------------------------------");
		
			for(int i=0;i<e.length;i++){
				System.out.println("emp id="+e[i].getId()+" emp name="+e[i].getName()+"emp salary="+e[i].getSalary());
			}
		
			int max=e[0].getSalary();
			String maxName=e[0].getName();
			for(int i=1;i<e.length;i++){
				if(e[i].getSalary()>max){
					max=e[i].getSalary();
					maxName=e[i].getName();
				}
			}
			int min=e[0].getSalary();
			String minName=e[0].getName();
			for(int i=1;i<e.length;i++){
				if(e[i].getSalary()<min){
					min=e[i].getSalary();
					minName=e[i].getName();
				}
			}
			System.out.println("--------------------------------------------------");
			System.out.println("higest salaery employee="+maxName+"="+max);
			System.out.println("lowest salary employee="+minName+"="+min);
		
	}
}