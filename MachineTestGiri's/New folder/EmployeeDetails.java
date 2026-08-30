/*Q6. Create an abstract class Employee with employee details and an abstract method 
calculateSalary(). Create an interface Bonus with method calculateBonus(). Implement both in 
PermanentEmployee and ContractEmployee. 
Explanation: 
• Permanent employees receive a bonus of 15% of salary.  
• Contract employees receive a bonus of 5%.  
• Use constructor to initialize employee information.  
• Calculate salary + bonus.  
• Display employee type, salary, bonus and final amount.  
Input: 
Permanent Employee: 
Name = Rahul 
Salary = 60000 
Contract Employee: 
Name = Amit 
Salary = 50000 
Output: 
Permanent Employee: 
Name = Rahul 
Salary = 60000 
Bonus = 9000 
Final Salary = 69000 
 
Contract Employee: 
Name = Amit 
Salary = 50000 
Bonus = 2500 
Final Salary = 52500 */

import java.util.*;
  public abstract class Employee{
	  String name;
	  int sal;
	  
	  Employee(String name ,int sal){
		  this.name=name;
		  this.sal=sal;
	  }
	  
	  public abstract void CalculateSalary();
	  public void display(){}
  }
  
  
  public interface void Bonus(){
	  public void calculateBonus();
  
  }
  
  class PermanentEmp extends Employee implements Bonus{
	  int bonus;
	  
	  PermanentEmp(String name ,int sal){
		  super(name,sal);
	  }
    
public int calculatBonus(){
  return (sal*15)/100;
}
  }

public int CalculateSalary(){
            return sal+bonus;
public void display() {
        System.out.println("Permanent Employee:");
        System.out.println("Name = " + name);
        System.out.println("Salary = " + (int)sal);
        System.out.println("Bonus = " + (int)calculateBonus());
        System.out.println("Final Salary = " + (int)calculateSalary());
        System.out.println();
    }


 class ContractEmp extends Employee implements Bonus{
	  int bonus;
	  
	  ContractEmp(String name ,int sal){
		  super(name,sal);
	  }
    
public int calculatBonus(){
  return (sal*5)/100;
}

public int CalculateSalary(){
            return sal+bonus;
public void display() {
        System.out.println("Permanent Employee:");
        System.out.println("Name = " + name);
        System.out.println("Salary = " + (int)sal);
        System.out.println("Bonus = " + (int)calculateBonus());
        System.out.println("Final Salary = " + (int)calculateSalary());
        System.out.println();
    }
}

public class EmployeeDetails{
	
		
    public static void main(String[] args) {
        
        Employee permEmp = new PermanentEmployee("Rahul", 60000);
        Employee contEmp = new ContractEmployee("Amit", 50000);

        // Displaying outputs
        permEmp.display();
        contEmp.display();
    }
}
		
		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 