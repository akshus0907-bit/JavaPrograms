import java.util.*;
class Product{
	private int id;
	private String name;
	private int price;
	private int qty;
	
	
	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	public void setname(String name){
		this.name=name;
	}
	public String name(){
		return name;
	}
	public void setprice(int price){
		this.price=price;
	}
	public int getprice(){
		return price;
	}
	public void setqty(int qty){
		this.qty=qty;
	}
	public int getqty(){
		return qty;
	}
}
class Customer{
	private id;
	private String name;
	private long contact;
	
	public void setid(int id){
		this.id=id;
	}
	public int getid(){
		return id;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setcontact(long contact){
		this.contact=contact;
	}
	public long getcontact(){
		return contact;
	}
}
class Shop{
	Product prod[];
	Customer cust;
	void acceptOrder(Product prod[],Customer cust){
		this.prod=prod;
		