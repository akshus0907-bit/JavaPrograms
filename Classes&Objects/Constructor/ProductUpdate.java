/*Question 15: Write a Java program to create a Product inventory and update product price.

Description: Create Product class with id, name and price. Store products using constructor.
 Accept product id and new price and update it.
INPUT:
Products:
1 Mouse 500
2 Keyboard 800
3 Monitor 9000

Enter Product Id to update: 2
Enter new price: 1000

OUTPUT:
Updated Product:
Keyboard Price: 1000

EXPLANATION:
Create Product class with fields id, name, price. Store 3 products in array using constructor.
 Accept product id to update. Search product by id in array. Update price of matching product.
 Display updated product name and new price.*/
 
 import java.util.*;
 public class ProductUpdate{
	 private int Id;
	 private String PName;
	 private int Price;
	 
	 ProductUpdate(int id,String n,int p){
		 Id=id;
		 PName =n;
		 Price=p;
	 }
	 public int getId(){
		 return Id;
	 }
	 public String getName(){
		 return PName;
	 }
	 public int getPrice(){
		 return Price;
	 }
	 public void setPrice(int p){
		 Price=p;
	 }
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 ProductUpdate p[]=new ProductUpdate[3];
		 System.out.println("enter  details");
		 for(int i=0;i<3;i++){
			 System.out.println("enter id ,name and price");
			 int id=in.nextInt();
			 String name=in.next();
			 int price =in.nextInt();
		 p[i]=new ProductUpdate(id,name,price);
		 }
		 System.out.println("enter product id to update");
          int key=in.nextInt();
		 System.out.println("enter new price");
		 int newPrice=in.nextInt();
		boolean found=false;
		for(int i=0;i<3;i++){
			if(p[i].getId()==key){
				p[i].setPrice(newPrice);
			
			System.out.println("updated product=");
			System.out.println(p[i].getName()+" :"+p[i].getPrice());
		   
		   found=true;
		   break;
		}
	 }
	 if(!found){
		 System.out.println("product not found");
	 }
 }
 }
 