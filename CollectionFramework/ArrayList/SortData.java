package org.techhub;
import java.util.*;

// 1. Implement Comparable<Employee>
class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int sal;

	public Employee() {
		
	}
	public Employee(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	// 2. Override compareTo() to define sorting logic
	@Override
	public int compareTo(Employee other) {
		// Sort by ID (Ascending)
		return Integer.compare(this.id, other.id);
		
		// To sort by Salary instead, use:
		// return Integer.compare(this.sal, other.sal);
		
		// To sort by Name instead, use:
		// return this.name.compareTo(other.name);
	}
}

public class EmployeeSortingApplication {
	public static void main(String[] args) {
		 List<Employee> al = new ArrayList<Employee>();
		 al.add(new Employee("ABC", 1, 10000));
		 al.add(new Employee("MNO", 5, 2000));
		 al.add(new Employee("PQR", 2, 20000));
		 al.add(new Employee("STV", 3, 3000));
		 al.add(new Employee("OOO", 4, 4000));
		 
		 System.out.println("Display employee data before sorting");
		 for(Employee e : al) {
			 System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		 }
		 
		 Collections.sort(al);
		 
		 // 3. Fixed text to "after sorting"
		 System.out.println("\nDisplay employee data after sorting");
		 for(Employee e : al) {
			 System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		 } 
	}
}
