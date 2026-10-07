/*6. Write a Java program to demonstrate Method Overriding where a child class provides its own 
implementation of a method defined in the parent class.*/

import java.util.*;
class Vehicle{
	void start(){
		System.out.println("start");
	}
}
class Bike extends Vehicle{
	void start(){
		System.out.println("bike start");
	}
} 
public class  demoMethodOverriding{
	public static void main(String[]args){
		Vehicle v=new Bike();
		v.start();
	}
}
	