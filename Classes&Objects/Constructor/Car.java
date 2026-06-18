/*Question 8: Write a Java program to create a Car class and display car details using constructor.

Description: Create Car POJO class with carId, carName and price. 
Initialize values using constructor and display car information.
INPUT:
Enter Car Id: 301
Enter Car Name: Swift
Enter Price: 650000

OUTPUT:
Car Details:
Id: 301
Name: Swift
Price: 650000

EXPLANATION:
Create Car class with fields carId, carName, price. 
Use constructor public Car(int id, String name, int price) to initialize. 
Create display() method to show all details. Create object new Car(301, "Swift", 650000) 
and call display().*/

import java.util.*;
public class Car{
	private int Id;
	private String Name;
	private int price;
	
	Car(int i,String n,int p){
		Id=i;
		Name=n;
		price=p;
	}
	void setId(int i){
		Id=i;
	}
	void setName(String n){
		Name=n;
	}
	void setprice(int p){
		price=p;
	}
	public int getId(){
		return Id;
	}
	public String getName(){
		return Name;
	}
	public int getprice(){
		return price;
	}
	
	void display(){
		System.out.println("car details");
		System.out.println("id="+getId()+"\nName="+getName()+"\nprice="+getprice());
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter  name");
		String name=in.nextLine();
		System.out.println("enter price");
		int price=in.nextInt();
		Car c=new Car(id,name,price);
		c.display();
	}
}
		
