/*Question 34: Write a Java program to implement a Parking Fee Calculator using POJO class.
Create a POJO class Parking with variables vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Input:
Enter Vehicle Number : 1234
Enter Hours : 5

Output:
Vehicle Number : 1234
Parking Fee : Rs. 130

Explanation:
A POJO class Parking has private fields: vehicleNumber and hours.
Setter methods store user input. Getter methods retrieve hours for fee calculation.
Fee logic:
- First 2 hours: 2 * 20 = 40
- Remaining: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2) add (hours - 2) * 30 to the base fee of 40.
If hours = 2, total = 40. If hours = 1, total = 1 * 20 = 20.
This demonstrates POJO with tiered fee calculation logic.*/

import java.util.*;
public class ParkingFeeCalculator{
	private int VehicleNo;
	private int Hours;
	
	public void setVehicleNo(int v){
		VehicleNo=v;
	}
	public void setHours(int h){
		Hours=h;
	}
	
	public int getVehicleNo(){
		return VehicleNo;
	}
	public int getHours(){
		return Hours;
	}
	public int getParkingFee(){
		int ParkingFee;
		if(getHours()<=2){
			ParkingFee=(getHours()*20);
		}
		else{
			ParkingFee=(2*20)+((getHours()-2)*30);
		}
		return ParkingFee;
	}
	public static void main(String []args){
		ParkingFeeCalculator p=new ParkingFeeCalculator();
		Scanner in=new Scanner(System.in);
		System.out.println("enter vehicle number");
		int VehicleNo=in.nextInt();
		System.out.println("enter hours");
		int Hours=in.nextInt();
		
		p.setVehicleNo(VehicleNo);
		p.setHours(Hours);
		
		System.out.println("------------------------------------");
		System.out.println("vehicle number="+p.getVehicleNo());
		System.out.println("ParkingFee    ="+p.getParkingFee());
	}
}
		