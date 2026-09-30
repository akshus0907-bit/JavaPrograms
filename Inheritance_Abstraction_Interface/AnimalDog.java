/*7. Write a Java program to demonstrate inheritance using `Animal` and `Dog` classes*/

class Animal{
	
	void eat(){
		System.out.println("animal eat");
		
	}
	void sound(){
	}
	
}
class Dog extends Animal{
	void sound(){
		System.out.println("dog barks");
	}
}
 public class AnimalDog{
	 public static void main(String[]args){
		 
		 Animal a=new Dog();
		 
		 a.sound();
	 }
 }
	