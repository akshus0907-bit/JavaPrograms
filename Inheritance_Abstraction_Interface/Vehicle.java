/*Question 2: Create a base class Vehicle with attributes brand and speed.
Create a child class Car that adds fuelType.
Display all details using inheritance.
Asked In Practice Assignment
Description
This program shows how a child class accesses parent properties and adds its own features.
Useful to understand data reuse using inheritance.

Input
Enter Brand: Toyota
Enter Speed: 120
Enter Fuel Type: Petrol

Output
Brand: Toyota
Speed: 120 km/h
Fuel Type: Petrol*/

import java.util.*;
  class Vehicle{
	String brand;
	int speed;
	Scanner in=new Scanner(System.in);
	void data(){
	System.out.println("enter brand");
	brand=in.nextLine();
	System.out.println("enter speed");
	speed=in.nextInt();
	in.nextLine();
	}
	void display(){
	System.out.println("Brand="+brand);
	System.out.println("Spees="+speed);
	}
	}
	class car extends Vehicle{
	String FuleType;
	void acceptFuleType(){
		System.out.println("enter fule type");
		FuleType=in.nextLine();
	}
	void displayFule(){
	System.out.println("fule type="+FuleType);
	}
	}
	public class VehicleApp{
	public static void main(String[]args){
	car c=new car();
	c.data();
	c.acceptFuleType();
	c.display();
	c.displayFule();
	}
	}
	
	