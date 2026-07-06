/*Question 3: Create a base class Student with attributes name and rollNo.
Create a child class Result that includes marks of 3 subjects.
Calculate total and percentage.
Asked In Practice Assignment
Description
This assignment demonstrates inheritance with calculation logic.
The child class uses parent data and extends it to compute academic results.

Input
Enter Name: Amit
Enter Roll No: 101
Enter Marks1: 80
Enter Marks2: 70
Enter Marks3: 90

Output
Name: Amit
Roll No: 101
Total Marks: 240
Percentage: 80.0%*/

import java.util.*;
	class Student{
	String name;
	int rollNo;
	Scanner in=new Scanner(System.in);
	
	void data(){
	System.out.println("enter name=");
	name=in.nextLine();
	System.out.println("enter rollNo=");
	rollNo=in.nextInt();
	in.nextLine();
	}
	void display(){
	System.out.println("name="+name);
	System.out.println("roll no="+rollNo);
	}
	}
	class Result extends Student{
	int m1,m2,m3;
	
	void marksdata(){
	System.out.println("enter marks1");
	m1=in.nextInt();
	System.out.println("enter marks2");
	m2=in.nextInt();
	System.out.println("enter marks3");
	m3=in.nextInt();
	}
	void calculateTotal(){
	int total=m1+m2+m3;
	double percentage=total/3.0;
	System.out.println("total marks="+total);
	System.out.println("percentage="+percentage);
	}
	
	}
	public class StudentApp{
	public static void main(String[]args){
	Result r=new Result();
	r.data();
	r.marksdata();
	r.display();
	r.calculateTotal();

	}
	}
	