/*Question 26: Write a Java program to implement a Student Result Analyzer using POJO class.
Create a POJO class Student with variables rollNo, marks1, marks2, and marks3.
Accept values using getter and setter methods and calculate:
- Total marks
- Average marks
- Result (Pass if average >= 40, otherwise Fail)
Input:
Enter Roll No : 101
Enter Marks1 : 60
Enter Marks2 : 50
Enter Marks3 : 45

Output:
Roll No : 101
Total Marks : 155
Average : 51.66
Result : Pass

Explanation:
A POJO (Plain Old Java Object) class Student has private fields: rollNo, marks1, marks2, marks3.
Public setter methods (setRollNo, setMarks1, setMarks2, setMarks3) assign values.
Public getter methods (getRollNo, getMarks1, etc.) retrieve values.
Total = marks1 + marks2 + marks3 = 60 + 50 + 45 = 155.
Average = Total / 3.0 = 155 / 3.0 = 51.66.
Since 51.66 >= 40, Result = Pass.
POJO classes promote data encapsulation by keeping fields private.*/

import java.util.*;
public class StudentResult{
	private int RollNo;
	private int Marks1,Marks2,Marks3;
	
	public void setRollNo(int n){
		RollNo=n;
	}
	public void setMarks1(int m1){
		Marks1=m1;
	}
	public void setMarks2(int m2){
		Marks2=m2;
	}
	public void setMarks3(int m3){
		Marks3=m3;
	}
	public int getRollNo(){
		return RollNo;
	}
	public int getMarks1(){
		return Marks1;
	}
	public int getMarks2(){
		return Marks2;
	}
	public int  getMarks3(){
		return Marks3;
	}
	
	public int getTotal(){
		int total;
		total =Marks1+Marks2+Marks3;
		return total;
	}
	public double getAverage(){
		double avg;
		avg=getTotal()/3.0;
		return avg;
	}
	public String getResult(){
		if(getAverage()>=40){
			return "pass";
		}
		else{
			return "fail";
		}
		
	}

public static void main(String[]args){
	StudentResult s=new StudentResult();
	Scanner in=new Scanner(System.in);
	System.out.println("enter roll no");
	int r=in.nextInt();
	System.out.println("enter marks1,\nmarks2,\nmarks3");
	int m1=in.nextInt();
	int m2=in.nextInt();
	int m3=in.nextInt();
	s.setRollNo(r);
	s.setMarks1(m1);
	s.setMarks2(m2);
	s.setMarks3(m3);
	
	System.out.println("--------------------");
	System.out.println("Roll no="+s.getRollNo());
	System.out.println("total marks="+s.getTotal());
	System.out.println("average="+s.getAverage());
	System.out.println("Result="+s.getResult());
	
}
}
	
	


