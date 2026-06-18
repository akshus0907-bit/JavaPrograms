/*Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary
Input:
Enter Employee Id : 201
Enter Name : Amit
Enter Salary : 45000

Output:
Employee Id : 201
Name : Amit
Salary : 45000
Category : Medium Salary

Explanation:
A class Employee is created with instance variables empId, name, and salary.
An object is created and values are accepted from the user via Scanner.
An if-else ladder is used to classify the salary:
- salary > 50000 prints High Salary
- salary >= 20000 && salary <= 50000 prints Medium Salary
- salary < 20000 prints Low Salary
Since 45000 falls between 20000 and 50000, the category is Medium Salary.
This program teaches multi-condition if-else with class objects.*/

import java.util.*;
public class Employee{
	int id;
	String name;
	double  salary;
	String category;
	
	public void set(int i,String n,double s){
		id=i;
		name=n;
		salary =s;
	}
	public void Category(){
		if(salary>50000){
			category="High salary";
		}
		else if(salary>=20000 && salary<=50000){
			category="Medium Salary";
		}
		else{
			category="Low salary";
		}
	}
	public void get(){
		System.out.println("----------------------------------");
		System.out.println("Employee id="+id);
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);
		System.out.println("category="+category);
	}
	public static void main(String[]args){
		Employee e=new Employee();
		Scanner in =new Scanner(System.in);
		System.out.println("enter id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter name");
		String name =in.nextLine();
		System.out.println("enter salary");
		double salary =in.nextDouble();
		
		e.set(id,name,salary);
		e.Category();
		e.get();
	}
}
