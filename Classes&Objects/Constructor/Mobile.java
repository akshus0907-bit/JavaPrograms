/*Question 13: Write a Java program to demonstrate constructor overloading in a Mobile 
class and apply discount calculation.

Description: Create Mobile class with mobileId, mobileName and price. Create
 overloaded constructors (one without discount, one with discount).
 If discount constructor used, reduce 10% price.
INPUT:
Enter Mobile Id: 101
Enter Mobile Name: Samsung
Enter Price: 20000

OUTPUT:
Original Price: 20000
Discount Price: 18000

EXPLANATION:
Create two constructors: public Mobile(int id, String name, int p) and 
public Mobile(int id, String name, int p, boolean discount). First constructor stores original price. 
Second constructor calculates 10% discount: price = price - (price * 10 / 100). 
Display both original and discounted price.*/

import java.util.*;
public class Mobile{
	private int MobileId;
	private String  MobileName;
	private int Price;
	
	Mobile(int id,String n,int p){
		MobileId=id;
		MobileName=n;
		Price=p;
	}
	Mobile(int id,String n,int p,int discount){
		MobileId=id;
		MobileName=n;
		Price=p-(p*discount/100);
	}
	public int getPrice(){
		return Price;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter Mobile id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter mobile name");
		String name=in.nextLine();
		System.out.println("enter price");
		int price=in.nextInt();
		System.out.println("enter dicount");
		int discount=in.nextInt();
		
		Mobile m1=new Mobile(id,name,price);
		Mobile m2=new Mobile(id,name ,price, discount);
		System.out.println("original price="+m1.getPrice());
		System.out.println("discount price="+m2.getPrice());
	}
	}