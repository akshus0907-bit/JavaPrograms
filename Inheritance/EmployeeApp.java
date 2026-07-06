/*Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.
Asked In Practice Assignment
Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000*/
import java.util.Scanner;
  class Employee  {
	String name;
	double salary;
	Scanner in=new Scanner(System.in);
	
	void acceptData(){
		System.out.println("enter name");
		 name=in.nextLine();
		System.out.println("enter salary");
		 salary=in.nextDouble();
	}
	 void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + salary);
    }
  }
	
	class Manager extends Employee{
		double bonus;
		
		void acceptBonus(){
			System.out.println("enter bonus");
			 bonus=in.nextDouble();
		}
		
	void calculateTotalSalary(){
		double totalsalary=salary+bonus;
		System.out.println("Bonus="+bonus);
		System.out.println("total salary="+totalsalary);
	}
	}
	public  class EmployeeApp{
	public static void main(String[]args){
		Manager m=new Manager();
		m.acceptData();
		
		m.acceptBonus();
		m.display();
		m.calculateTotalSalary();
	}
	}
	


		