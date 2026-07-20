/*Question 118: Write a Java program to implement tax calculation system using interface
Asked In Practice Assignment
Create a POJO class Person with fields name, income, and age.
Create an interface Tax with method calculateTax(Person p).

Income > 500000 ? 20%
Else ? 10%

Input:
Enter name: Ajay
Enter income: 600000
Enter age: 30

Output:
Tax : 120000*/

import java.util.*;
class Person{
	private String Name;
	private int Income;
	private int Age;
	

	public void setName(String name){
		Name=name;
	}
	public String getName(){
		return Name;
	}
	public void setIncome(int income){
		Income=income;
	}
	public int getIncome(){
		return Income;
	}
	public void setAge(int age){
		Age=age;
	}
	public int getAge(){
		return Age;
	}
}
	 
	 interface Tax{
		 
		void calculateTax(Person p);
	 }
	 class TaxCalApp implements Tax{
		 public void calculateTax(Person p){
		     double tax;
		if(p.getIncome()>500000){
			tax=(p.getIncome()*20)/100;
			System.out.println("Tax="+tax);
		}
		else{
			 tax=(p.getIncome()*10)/100;
		}
			System.out.println(tax);
		 }
	 }
	public class InterfaceTaxCal{
		public static void main(String []args){
			Scanner in=new Scanner(System.in);
		 Person p = new Person();

			System.out.println("enter name");
			String name=in.nextLine();
			System.out.println("enter income");
			int income=in.nextInt();
			in.nextLine();
			System.out.println("enter age");
			int age=in.nextInt();
			p.setName(name);
			p.setIncome(income);
			p.setAge(age);
			
			TaxCalApp t=new TaxCalApp();
			t.calculateTax(p);
		}
	}

			
			
		 
	
	
	