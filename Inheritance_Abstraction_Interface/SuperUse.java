/*10. Write a Java program to demonstrate the use of the super keyword. Create a parent class with a 
variable and method, and access both from the child class using super.*/

class parent {
	
	int number=100;
	
	void method(){
		System.out.println("method");
	}
}
class Child extends parent{
	int numbe=200;
	
	
	void method(){
		System.out.println(super.number);
		super.method();
	}
}
public class SuperUse{
	public static void main(String[]args){
		parent p=new Child();
		p.method();
	}
}
	