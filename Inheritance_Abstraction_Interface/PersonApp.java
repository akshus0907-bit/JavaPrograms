/*Question 5: Create a base class Person with method display().
Create a child class Employee that overrides display() to show additional details like designation.
Asked In Practice Assignment
Description
This assignment demonstrates method overriding in inheritance.
The child class modifies the behavior of the parent method.

Input
Enter Name: Suresh
Enter Age: 30
Enter Designation: Manager
Output
Name: Suresh
Age: 30
Designation: Manager*/

import java.util.*;
class Person{
	String name;
	int age;
	
	void disaply(){
	System.out.println("Name="+name);
	System.out.println("Age="+age);
	}
	}
	class Employee extends Person{
	String designation;
	 
	 void disaply(){
	 System.out.println("Name="+name);
	 System.out.println("Age="+age);
	 System.out.println("Designation="+designation);
	 }
	 }
	 public class PersonApp{
	 public static void main(String[]args){
	 Scanner in=new Scanner(System.in);
	 Employee e=new Employee();
	 System.out.println("enter name");
	 e.name=in.nextLine();
	 System.out.println("enter age");
	 e.age=in.nextInt();
	 in.nextLine();
	 System.out.println("enter designation");
	 e.designation=in.nextLine();
	 
	 e.disaply();
	 }
	 }