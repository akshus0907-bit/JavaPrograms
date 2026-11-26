/*WAP to create collection and store 5 employee object in it 
and fetch or show employee data whose salary is greater than 10000 */
import java.util.*;
import java.util.function.*;
class Employee{
	private int id;
	private String name;
	private int sal;
	
	Employee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void  setId(int id){
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
	public void setSal(int  sal){
		this.sal=sal;
	}
	public int getSal(){
		return sal;
	}
	
}

public class EmployeeApp{
	public static void main(String[]args){
		List<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(1,"abc",20000));
		list.add(new Employee(2,"pqr",1000));
		
		Predicate<Employee>p=(Employee e)->e.getSal()>100;

		Consumer <Employee>c=(Employee e)->{
				if(p.test(e)){
					System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
				}
			
		};
		list.forEach(c);
		
	}
}
