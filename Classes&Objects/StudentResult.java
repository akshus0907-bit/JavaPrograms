/*Question 1: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72

Output:
Student Id : 101
Student Name : Rahul
Marks : 72
Result : Pass

Explanation:
A class Student is created with three instance variables: id, name, and marks.
An object of the Student class is created in main() using: Student s = new Student();
The user inputs id, name, and marks using Scanner.
An if-else condition checks whether marks >= 35.
Since 72 >= 35, the result is Pass.
If the marks were less than 35, the result would be Fail.
This program teaches class creation, object instantiation, and conditional logic in Java.*/

import java.util.*;
public class StudentResult{
	String name;
	int id;
	int marks;
	String result;


public void set(String n,int i,int m){
	name=n;
	id=i;
	marks=m;
}
public void Result(int marks){
	if(marks>=35){
		result="pass";
	}
	else{
		result="fail";
	}
}
public void get(){
	System.out.println("---------------------------------");
	System.out.println("student id=  \t"+id);
	System.out.println("student name=\t"+name);
	System.out.println("marks=       \t"+marks);
	System.out.println("result=      \t"+result);
}
public static void main(String []args){
	StudentResult s=new StudentResult();
	Scanner in=new Scanner(System.in);
	System.out.println("enter id");
	int id=in.nextInt();
	in.nextLine(); //buffer clear
	System.out.println("enter name");
	String name=in.nextLine();
	System.out.println("enter marks");
	int marks=in.nextInt();
	
	s.set(name,id,marks);
	s.Result(marks);
	s.get();
}
}


