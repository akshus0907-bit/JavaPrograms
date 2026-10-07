/*1. Write a Java program to demonstrate Encapsulation by creating a Student class with private data 
members name and age, and public getter and setter methods. */
import java.util.*;
class Stu{
	private String name;
	private int age;
	
	void setname(String name){
		this.name=name;
	}
	void setage(int age){
		this.age=age;
	}
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
}


public class Student{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Stu s=new Stu();
		
		System.out.print("enter name");
		String name=in.nextLine();
	
		System.out.println("enter age");
		int age=in.nextInt();
		s.setname(name);
		s.setage(age);
		
		System.out.println(s.getname()+ " "+s.getage());
	}

}
