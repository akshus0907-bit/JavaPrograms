/*Question 30: Write a Java program to implement a Product Discount Calculator using POJO class.
Create a POJO class Product with variables productId, price, and quantity.
Using getter and setter methods:
- Calculate total amount = price * quantity
- If total > 5000 => 10% discount
- Otherwise => No discount
Display final amount.
Input:
Enter Product Id : 101
Enter Price : 1200
Enter Quantity : 5

Output:
Product Id : 101
Total Amount : 6000
Discount : 600
Final Amount : 5400

Explanation:
A POJO class Product has private fields: productId, price, quantity.
Total Amount = price * quantity = 1200 * 5 = 6000.
Condition: if (totalAmount > 5000) => 10% discount.
Discount = 6000 * 10 / 100 = 600.
Final Amount = 6000 - 600 = 5400.
Setters store values entered by user. Getters retrieve them for calculation.
This demonstrates POJO encapsulation combined with business discount logic.*/

import java.util.*;
public class DiscountCalculator{
	private int Id;
	private double Price;
	private int Quentity;
	
	public void setId(int i){
		Id=i;
	}
	public void setPrice(double p){
		Price=p;
	}
	public void setQuentity(int q){
		Quentity=q;
	}
	public int getId(){
		return Id;
	}
	public double getPrice(){
		return Price;
	}
	public int getQuentity(){
		return Quentity;
	}
	public double getTotal(){
		double total;
		total=getPrice()*getQuentity();
		return total;
	}
	public double getDiscount(){
		double Discount;
		if(getTotal()>=5000){
		Discount=(getTotal()*10)/100;
		}
		else{
			Discount=0;
		}
		return Discount;
	}
	public double getFinalPrice(){
		double FinalPrice;
		FinalPrice=(getTotal()-getDiscount());
		return FinalPrice;
	}
	
	public static void main(String[]args){
		DiscountCalculator d=new DiscountCalculator();
		Scanner in=new Scanner(System.in);
		System.out.println("enter id");
		int id=in.nextInt();
		System.out.println("enter price");
		double Price=in.nextInt();
		System.out.println("enter quentity");
		int Quentity=in.nextInt();
		d.setId(id);
		d.setPrice(Price);
		d.setQuentity(Quentity);
		System.out.println("----------------------------------");
		System.out.println("Product Id="+d.getId());
		System.out.println("Amount="+d.getTotal());
		System.out.println("Discount="+d.getDiscount());
		System.out.println("Final price="+d.getFinalPrice());
	}
}
		
		
	
	