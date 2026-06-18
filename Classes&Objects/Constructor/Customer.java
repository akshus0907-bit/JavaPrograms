/*Question 14: Write a Java program to create a Customer class and search a customer by id.

Description: Create Customer POJO class with id, name and city. Store multiple customers using constructor. 
Accept id from user and search customer.
INPUT:
Enter Customers:
1 Raj Pune
2 Amit Mumbai
3 Neha Nashik

Enter search Id: 2

OUTPUT:
Customer Found
Name: Amit
City: Mumbai

EXPLANATION:
Create Customer class with fields id, name, city. Use constructor to initialize. 
Create Customer[] array and store 3 customers. Accept search id from user. Loop through array, 
if id matches print "Customer Found" with name and city else print "Not Found".*/

import java.util.*;
public class Customer{
	private int Id;
	private String Name;
	private String City;
	
	Customer(int id,String n,String c){
		Id=id;
		Name=n;
		City=c;
	}
	public int getId(){
		return Id;
	}
	public String getName(){
		return Name;
	}
	public String getCity(){
		return City;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Customer[]c=new Customer[3];
		System.out.println("ënter 3 customer id , name and city");
		for(int i=0;i<3;i++){
			int id=in.nextInt();
			String name=in.next();
			String city=in.next();
			c[i]=new Customer(id,name,city);
		}
		boolean found=false;
		System.out.println("enter Search id");
		int key=in.nextInt();
		for(int i=0;i<3;i++){
			if(c[i].getId()==key){
				System.out.println("customer found=\n"+c[i].getName()+ "\n"+c[i].getCity());
				found=true;
				break;
			}
		}
		if(!found){
			System.out.println("not fount");
		}
	}
}
	

		
		

