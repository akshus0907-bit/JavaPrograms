/*5. Write a Java program to demonstrate object creation by creating an `Employee` class and creating
two Employee objects*/

class Emp{
	int id;
	String name;
	
	public static void main(String[]args){
		Emp e1=new Emp();
		
		e1.id=101;
		e1.name="Akshata";
		
		System.out.println("employee id :"+ e1.id);
		System.out.println("employee name :"+e1.name);
		
		Emp e2=new Emp();
		
		e2.id=102;
		e2.name="Rushi";
		
		System.out.println("employee id :"+ e2.id);
		System.out.println("employee name :"+e2.name);
	
}
}

