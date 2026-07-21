/*Question 121: Write a Java program to implement order billing system using interface
Asked In Practice Assignment
Create a POJO class Order with fields orderId, itemName, price, and quantity.
Create an interface Billing with method generateBill(Order o).
Calculate total cost and apply:

10% discount if total > 5000

Input:
Enter orderId: 101
Enter item: Mobile
Enter price: 3000
Enter quantity: 2

Output:
Total : 6000
Discount : 600
Final Bill : 5400*/

import java.util.*;
class Order{
	private int OrderId;
	private String IteamName;
	private int Price;
	private int Quantity;
	
	public void setOrderId(int id){
		OrderId=id;
	}
	public int getOrderId(){
		return OrderId;
	}
	public void setIteamName(String name){
		IteamName=name;
	}
	public String getOrderName(){
		return IteamName;
	}
	public void setPrice(int price){
		Price=price;
	}
	public int getPrice(){
		return Price;
	}
	public void setQuantity(int quantity){
		Quantity=quantity;
	}
	public int getQuantity(){
		return Quantity;
	}
}
interface OrderApp{
	 void generateBill(Order o);
}

class Abc implements OrderApp{
	public void generateBill(Order o){
		double total=(o.getPrice()*o.getQuantity());
		double discount= (total*10)/100;
		double finalBill=0;
		if(total>5000){
			 finalBill=total-discount;
		}
		else{
			System.out.println("no discount="+total);
		}
		System.out.println("final bill="+finalBill);
	}
}
public class InterfaceOrderBillApp{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Order r=new Order();
		System.out.println("ënter order id");
		int id=in.nextInt();
		System.out.println("enter iteam name");
		String name=in.nextLine();
		in.nextLine();
		System.out.println("ënter iteam price");
		int price=in.nextInt();
		
		System.out.println("enter iteam quentity");
		int quantity=in.nextInt();
		
		r.setOrderId(id);
		r.setIteamName(name);
		r.setPrice(price);
		r.setQuantity(quantity);
		
		
		Abc a=new Abc();
		a.generateBill(r);
	}
}