/*9. Write a Java program to demonstrate Abstraction using an abstract class Employee with an 
abstract method calculateSalary(), and implement it in a Developer class. */

abstract class Employee{
	abstract void calculateSalary();
}
class Developer extends Employee{
	
	void calculateSalary(){
		int salary=400;
		int bonus=100;
		int total=salary+bonus;
		
		System.out.println(salary+ " "+bonus+" "+total);
	}
}
public class EmployeeAbstract{
	public static void main(String[]args){
		Employee e=new Developer();
		e.calculateSalary();
	}
}
		