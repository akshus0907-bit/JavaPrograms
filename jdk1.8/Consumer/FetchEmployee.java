//fetch employee using for each 
import java.util.*;
import java.util.function.*;
class Employee{
	private int id;
	private String name;
	


Employee(int id,String name){
	this.id=id;
	this.name=name;
}
public void setId(int id){
	this.id=id;
}
public int getId(){
	return id;
}
public void setName(String name){
	this.name=name;
	
}
public String getName(){
	return name;
}
}

public  class FetchEmployee{
	public static void main(String[]args){
		List<Employee>list= new ArrayList<Employee>();
		list.add(new Employee(1,"ABC"));
		list.add(new Employee(2,"PQR"));
		
		
			
		 list.forEach((emp)->System.out.println(emp.getId()+"\t"+emp.getName()));

	}
}
