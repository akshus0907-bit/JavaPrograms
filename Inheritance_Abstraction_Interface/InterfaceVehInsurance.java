/*Question 120: Write a Java program to implement vehicle insurance calculation using interface
Asked In Practice Assignment
Create a POJO class Vehicle with fields vehicleNo, type, and price.
Create an interface Insurance with method calculateInsurance(Vehicle v).

Car ? 5% of price
Bike ? 2% of price

Input:
Enter vehicleNo: MH12AB1234
Enter type: Car
Enter price: 800000

Output:
Insurance Amount : 40000*/

import java.util.*;
class Vehicle{
	private String VehicleNo;
	private String Type;
	private int Price;
	
	public void setVehicleNo(String no){
		VehicleNo=no;
	}
	public String getVehicleNo(){
		return VehicleNo;
	}
	public void setType(String type){
		Type=type;
	}
	public String getType(){
		return Type;
	}
	public void setPrice(int price){
		Price=price;
	}
	public int getPrice(){
		return Price;
	}
}
interface vheicleAppes{
	 void calculateInsurance(Vehicle v);
	
}
class ABC implements vheicleAppes{
	public void calculateInsurance(Vehicle v){
	double insuranceamount;
	if(v.getType().equalsIgnoreCase("Car")){
		insuranceamount=(v.getPrice()*5)/100;
	}
	else{
		insuranceamount=(v.getPrice()*2)/100;
	}
	System.out.println("Insurance Amount ="+insuranceamount);
	}
}
  public class InterfaceVehInsurance{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Vehicle x=new Vehicle();
		System.out.println("ënter vehicle number");
		String vehicleNo=in.nextLine();
		System.out.println("ënter type");
		String type=in.nextLine();
		System.out.println("enter price");
		int price=in.nextInt();
		x.setVehicleNo(vehicleNo);
		x.setType(type);
		x.setPrice(price);
		
		ABC p = new ABC();
		p.calculateInsurance(x);
	}
}

		
		

