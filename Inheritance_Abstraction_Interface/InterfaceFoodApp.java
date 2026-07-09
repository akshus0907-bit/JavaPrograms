/*Question 115: Write a Java program to implement food ordering system using interface
Asked In Practice Assignment
Create interface FoodOrder with method placeOrder().
Implement in Pizza and Burger.
Display order details and total cost.

Input:
Enter choice (1-Pizza, 2-Burger): 1
Enter quantity: 2

Output:
Pizza ordered
Total Cost : 400*/

import java.util.*;
interface Food{
	void placeOrder();
}
 class pizza implements Food{
	 int quantity;
	 pizza(int quantity){
		 this.quantity=quantity;
	 }
	 
	 public void placeOrder(){
		 double cost=100*quantity;
		 System.out.println("cost="+cost);
	 }
 }
 class Burger implements Food{
	 int quantity1;
	 Burger(int quantity1){
		 this.quantity1=quantity1;
	 }
	 public void placeOrder(){
		 double cost=100*quantity1;
		 System.out.println("cost="+cost);
	 }
 }
 public class InterfaceFoodApp{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter choice \n1.pizza \n2.burger");
		 int choice=in.nextInt();
		 Food f;
		 switch(choice){
			 case 1:
			 System.out.println("enter quantity");
			 int quantity=in.nextInt();
			 f=new pizza(quantity);
			 
			 f.placeOrder();
			 break;
			 
			 case 2:
			 System.out.println("enter quantity");
			 int quantity1=in.nextInt();
			 f=new Burger(quantity1);
			 f.placeOrder();
			 break;
			 
			 default:
			 System.out.println("invalid choice");
		 }
	 }
 }
			 
			 
			 
			 

		 
	 
		 