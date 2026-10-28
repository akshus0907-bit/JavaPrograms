/*Q6. Create an Employee class containing id, name, department, and salary. 
Given a list of employees, sort the list using the following rules: 
1. Sort by salary in descending order. 
2. If salaries are equal, sort by name in ascending alphabetical order. 
3. If both salary and name are equal, sort by employee ID in ascending order. 
Requirements: 
• Implement Comparable<Employee> for sorting by employee ID. 
• Use a Comparator<Employee> for the required multi-level sorting. 
• Demonstrate the difference between Comparable and Comparator. 
• Display the employee list before and after sorting.*/





package org.techhub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	 int id;
	String name;
	String department;
	int salary;
	   
	
	Employee(int id , String name , String department,int salary){
		
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
		
	}
	
	public int getid() {                       //pojo class 
		return id;		
	}
	
	public String  getname() {
		return name ;
	}
	public String department() {
		return department;
		
	}
	public int getsalary() {
		return salary;
	}
	
	public int compareTo(Employee s){                    //use compare to method to sort the data 
		if(this.salary>s.salary){
			return 1;
		}
		else if(this.salary<s.salary){
			return -1;
			
		}
		else
			return 0;
		}
	}


public class SortSalaryQ6{
	public static void main(String[]args){
		List<Employee> al=new  ArrayList<Employee>();
		
		al.add(new Employee(1,"abc","it",30000));
		al.add(new Employee(2,"pqr","hr",40000));
		al.add(new Employee(3,"xyz","finance",90000));
		
		
		System.out.println("Display Employee data before  Sorting");
		
		for(Employee s:al){
			System.out.println(s.getname()+"\t"+s.getsalary());
		}
		
		Collections.sort(al);
		System.out.println("Display Student data after sorting");
		
		for(Employee s:al){
			System.out.println(s.getname()+"\t"+s.getsalary());
			
		}
		
	}
}




