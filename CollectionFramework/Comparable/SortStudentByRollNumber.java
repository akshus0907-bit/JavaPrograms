/*Sort Students by Roll Number

Create a Student class with rollNo and name. Sort students in ascending order of roll number.

Concept: Comparable<Student>, compareTo()*/


import java.util.*;

class Student implements Comparable<Student>{
	
	private String name;
	private int rollNo;
	
	
	public Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	
	}
	public String getname(){
		return name;
	}
	public int getrollNo(){
		return rollNo;
	}
	
	
	public int compareTo(Student s){
		if(this.rollNo>s.rollNo){
			return 1;
		}
		else if(this.rollNo<s.rollNo){
			return -1;
			
		}
		else
			return 0;
		}
	}


public class SortStudentByRollNumber{
	public static void main(String[]args){
		List<Student> al=new  ArrayList<Student>();
		
		al.add(new Student("ABC",1));
		al.add(new Student("MNO",2));
		al.add(new Student("PQR",3));
		
		
		System.out.println("Display student data before  Sorting");
		
		for(Student s:al){
			System.out.println(s.getname()+"\t"+s.getrollNo());
		}
		
		Collections.sort(al);
		System.out.println("Display Student data after sorting");
		
		for(Student s:al){
			System.out.println(s.getname()+"\t"+s.getrollNo());
			
		}
		
	}
}