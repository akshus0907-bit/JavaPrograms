/*Question 4: Write a Java program to create a Product class and check whether 
product price is expensive or affordable.

Description: Create Product POJO class with productId, productName and price.
 Use constructor to initialize values. If price > 1000 print Expensive otherwise Affordable.
INPUT:
Enter Product Id: 501
Enter Product Name: Headphones
Enter Price: 1200

OUTPUT:
Product Name: Headphones
Category: Expensive Product

EXPLANATION:
Create Product class with fields productId, productName, price.
 Use constructor public Product(int id, String name, int p) to initialize. 
 In constructor or display method, check if price > 1000 then print 
 "Expensive Product" else "Affordable Product". Display product name and category.*/

import java.util.*;
public class Product{
	private int ProductId;
	private String ProductName;
	private int price;
	
	Product(int i,String n,int p){
		ProductId=i;
		ProductName=n;
		price=p;
	}
	void display(){
		
		
		System.out.println("Product name="+ProductName);
		if(price>1000){
			System.out.println("expensive product");
		}
		else{
			System.out.println("Affordable product");
		}
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter product id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter product name");
		String n=in.nextLine();
		System.out.println("enter price");
		int price=in.nextInt();
		Product p=new Product(id,n,price);
		p.display();
	}
}
		
		
	