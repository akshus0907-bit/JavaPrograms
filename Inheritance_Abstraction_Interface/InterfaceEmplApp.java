/*Question 114: Write a Java program to calculate employee salary using interface.
Asked In Practice Assignment
Create an interface Employee with method calculateSalary().
Implement in FullTimeEmployee and PartTimeEmployee.

Full-time ? salary = fixed + bonus
Part-time ? salary = hours × rate

Input:
Enter type (1-FullTime, 2-PartTime): 2
Enter hours: 5
Enter rate per hour: 200

Output:
Salary : 1000*/

import java.util.*;
 interface Employee{
	 void calculateSalary();
 }
 class FullTimeEmployee implements Employee{
	 double fixedSal;
	 double bonus;
	 
    FullTimeEmployee(double fixedSal,double bonus){
		  this.fixedSal=fixedSal;
		  this.bonus=bonus;
	  }
	  public void calculateSalary(){
		  double salary=fixedSal+bonus;
		  System.out.println("Salary ="+salary);
	  }
 }
 class PartTime implements Employee{
	  double hour,rate;
	  
	  PartTime(double hour,double rate){
		  this.hour=hour;
		  this.rate=rate;
	  }
	  public void calculateSalary(){
		  double salary=hour*rate;
		  System.out.println("salary="+salary);
	  }
 }
 public class InterfaceEmplApp{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter choice \n1.FullTime \n2.PartTime");
		 int choice=in.nextInt();
		 Employee e;
		 switch(choice){
			 case 1:
			 System.out.println("enter fixed salary");
			 double fixedSal=in.nextDouble();
			 
			 System.out.println("enter bonus");
			 double bonus=in.nextDouble();
			 
			 e=new PartTime(fixedSal,bonus);
			 e.calculateSalary();
			 break;
			
			case 2:
			System.out.println("enter hour");
			double hour=in.nextDouble();
			
			System.out.println("enter rate");
			double rate=in.nextDouble();
			
			e=new FullTimeEmployee(hour,rate);
			e.calculateSalary();
			break;
			
			default:
			System.out.println("invalid choice");
		 }
	 }
 }
			
			
			 
			 
			 
 