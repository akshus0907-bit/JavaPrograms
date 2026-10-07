/*3. Write a Java program to demonstrate Method Overriding and Runtime Polymorphism using a 
parent class Animal and child classes Dog and Cat. */

class Animal{
	void eat(){
		System.out.println("animal eat");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("dog eat bons");
	}
}
class Cat extends Animal{
	void eat(){
		System.out.println("cat eat fish");
	}
}
public class MethodOverrding{
	public static void main(String[]args){
		Animal a=new Cat();
		a.eat();
	}
}
		
	