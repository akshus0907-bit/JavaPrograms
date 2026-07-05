 /*Q8. A software company wants to automate its employee payroll system. Create a Java application using 
Class, Object, Parameterized Constructor, Array of Objects, Setter and Getter methods. 
Store details of multiple employees and perform various logical CRUD and reporting operations. 
 
Explanation 
Create an Employee class having the following attributes: 
employeeId, employeeName, department, designation, basicSalary, experience, rating. 
 
Create 
• Parameterized Constructor  
• Getter Methods  
• Setter Methods  
Store all employee objects inside an array of objects. 
 
Perform Following 9 Operations –  
 
1. Add Nth Employees & display it. 
2. Search Employee by Employee ID. 
3. Update Employee Salary using Employee experience. 
4. Delete Employee Record. 
5. Find Highest Salary Employee. 
6. Display Employees whose Experience is greater than 5 Years. 
7. Increase Salary by 10% for Employees having Rating greater than or equal to 4.5. 
8. Display Department-wise Total Salary. 
Example 
HR : 150000 
IT : 350000 
Testing : 120000*/

import java.util.*;
public class Employee{            
	int EmpId;
	String EmpName;
	String department;
	int basicSalary;
	int experience;
	int Rating;
	
	Employee(int id,String name,String dep,int basic,int exp,              //parameter constructor
	int rating)
	{
		EmpId=id;
	 EmpName=name;
	 department=dep;
	 basicSalary=basic;
	 experience=exp;
	 Rating=rating;
	}
	public void set(int id,String name,String dep,int basic,int exp,   //setter method
	int rating)
	{
		EmpId=id;
	 EmpName=name;
	 department=dep;
	 basicSalary=basic;
	 experience=exp;
	 Rating=rating;
	}
	public int getEmpId(){                //getter method
		return EmpId;
	}
	public String getEmpName(){
		return EmpName;
	}
	public String getdepartment(){
		return department;
	}
	public int  getbasicSalary(){
		return basicSalary;
	}
	public int getexperience(){
		return experience;
	}
	public int getRating(){
		return Rating;
	}
	public void display(){                         //display output
		System.out.println("name="+getEmpName);
		Ststem.out.println("id="+getEmpId);
		System.out.println("department="+getdepartment);
		System.out.println("basicSalary="+getbasicSalary);
		System.out.println("experience"+getexperience);
		System.out.println("rating="+getRating);
}
	
	public static void main(String[]args){
		Employee e=new Employee();
		Scanner in =new Scanner(System.in);
		System.out.println("enter id,name ,department,basicSalary,experience,rating");
		int id=in.nextInt();
		in.nextLine();
		
		String dep =in.nextLine();
		int basic=in.nextInt();
		in.nextLine();
		String exp=in.nextLine();
		int reate=in.nextInt();
		e.set(id,name ,department,basic,experience,rating);
		e.display();
	}
		
	}

		