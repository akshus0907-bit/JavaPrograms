/*Question 1: Write a Java program to create a Student POJO class 
with fields rollNo, name and marks. Use a parameterized constructor 
to initialize values and display student details.

Description: Create a Student class having private data members
 rollNo, name and marks. Initialize values using a constructor 
 and display details using an object. Demonstrate object initialization using constructor.
INPUT:
Enter Roll No: 101
Enter Name: Rahul
Enter Marks: 78

OUTPUT:
Student Details:
Roll No: 101
Name: Rahul
Marks: 78

EXPLANATION:
Create Student class with private fields. Use parameterized constructor 
public Student(int rollNo, String name, int marks) to initialize values.
 Create display method to show details. 
 Create object with new Student(101, "Rahul", 78) and call display().*/

import java.util.*;
public class Student{
	private int RollNo;
	private String Name;
	private int Marks;
	
	Student(int r,String n,int m){
		RollNo=r;
		Name=n;
		Marks=m;
	}
	void display(){
		System.out.println("Roll no="+RollNo + "\nName="+Name+"\nMarks="+Marks);
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter name");
		String name=in.nextLine();
		System.out.println("enter roll no");
		int r=in.nextInt();
		System.out.println("enter marks");
		int m=in.nextInt();
		Student s=new Student(r,name,m);
		
		s.display();
	}
}
		
		