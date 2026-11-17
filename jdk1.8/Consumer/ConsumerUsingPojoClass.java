/*WAP to create List collection and store 5 employee 
object in it and fetch data by using forEach() method */

import java.util.*;
import java.util.function.*;

class Employee{
	private int id;
	private String name;
	
	Employee(){
		
	}
	Employee(int id, String name){
		this.id=id;
		this.name=name ;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name ;
	}
}

public class ConsumerUsingPojoClass{
	public static void main(String[]args){
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(1,"abc"));
		list.add(new Employee(2,"pqr"));
		list.add(new Employee(3,"xyz"));
		
		
		
		list.forEach((Employee emp)->System.out.println(emp.getid()+"\t"+emp.getname()));
	}
}

