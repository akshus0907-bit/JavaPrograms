/*Question 31: Write a Java program to implement an Electricity Bill Generator using POJO class.
Create a POJO class Electricity with variables customerId and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Input:
Enter Customer Id : 501
Enter Units : 250

Output:
Customer Id : 501
Units : 250
Total Bill : Rs. 1850

Explanation:
A POJO class Electricity has private fields: customerId and units.
Setter methods store user input. Getter methods retrieve units for calculation.
Slab-based bill calculation:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
If-else conditions check if units > 200, units > 100 to apply slabs.
This program shows POJO with real-world tiered billing logic.*/

import java.util.*;
public class ElectricityBill{
	private int Id;
	private double Unit;
	
	public void setId(int i){
		Id=i;
	}
	public void setUnit(double u){
		Unit=u;
	}
	
	public int getId(){
		return Id;
	}
	public double getUnit(){
		return Unit;
	}
	public double getTotalBill(){
		double TotalBill;
		if(Unit<=100){
			 TotalBill=(Unit*5);
		}
		else if(Unit<=200){
			TotalBill=((100*5)+(Unit-100)*7);
		}
		else {
			TotalBill=(100*5)+(100*7)+((Unit-200)*13);
		}
		return TotalBill;
	}
	public static void main(String[]args){
		ElectricityBill e =new ElectricityBill();
		Scanner in =new Scanner(System.in);
		System.out.println("enter customer id");
		int Id=in.nextInt();
		System.out.println("enter unit");
		double Unit=in.nextDouble();
		e.setId(Id);
		e.setUnit(Unit);
		System.out.println("-----------------------------------------------");
		System.out.println("Customer Id="+e.getId());
		System.out.println("Units=      "+e.getUnit());
		System.out.println("Total Bill= "+e.getTotalBill());
	}
}
		
	
