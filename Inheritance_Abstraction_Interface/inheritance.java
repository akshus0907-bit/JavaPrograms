/*2. Write a Java program to demonstrate Inheritance using the extends keyword. Create a Parent class 
with a method display() and a Child class that inherits and calls the method. */

class Animal{
	void display(){
		System.out.println("animal eat");
	}
}
class Dog extends Animal{
	void display(){
		System.out.println("dog barks");
	}
}
public class inheritance{
	public static void main(String[]args){
		Animal a=new Dog();
		
		a.display();
		
	}
}