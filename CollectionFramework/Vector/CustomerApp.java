/*Q16.Create Customer class: 
● id 
● name 
● age 
Store customers in Vector and display customers eligible for voting (age ≥18). 
Description 
Logical condition: 
age >= 18 
Input 
1 Ravi 17 
2 Meena 22 
3 Arjun 19 
4 Tina 15 
Output 
Eligible customers: 
 
2 Meena 22 
3 Arjun 19 */

import java.util.*;
class Customer{
	private int id;
	private String name;
	private int age;
	
	public Customer(){}
	
	public Customer(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void setId(int id){
		this.id-=id;
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
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}

public class CustomerApp{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number of student");
		int n=in.nextInt();
		
		Vector<Customer>v=new Vector<>();
		
		for(int i=0;i<n;i++){
			System.out.println("enter id,name,age");
			int id=in.nextInt();
			String name=in.next();
			int age=in.nextInt();
			 Customer c=new Customer(id,name ,age);
			 v.add(c);
		}
		
		System.out.println("Eligible customer");
		Iterator<Customer>itr=v.iterator();
		for(int i=0;i<n;i++){
			
			
			  while (itr.hasNext()) {
            Customer c = itr.next();
           if(c.getAge()>=18){
			   System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAge());
        }
			  }
		}
	}
}

       