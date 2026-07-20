/*Question 119: Write a Java program to implement hospital billing system using interface
Asked In Practice Assignment
Create a POJO class Patient with fields id, name, daysAdmitted, and chargePerDay.
Create an interface HospitalBilling with method calculateBill(Patient p).
Add ?500 service charge.

Input:
Enter id: 1
Enter name: Riya
Enter days: 3
Enter charge per day: 2000

Output:
Total Bill : 6500*/


import java.util.*;
class Patient{
	private int Id;
	private String Name;
	private int DaysAdmitted;
	private int ChargePerPay;
	
	public void setId(int id){
	Id=id;
	}
	public int getId(){
	return Id;
	}
	public void setName(String name){
	Name=name;
	
	}
	public String getName(){
	return Name;
	}
	public void setDaysAdmitted(int daysAdmitted){
	DaysAdmitted=daysAdmitted;
	}
	public int getDaysAdmitted(){
	return  DaysAdmitted;
	}
	public void setChargePerPay(int chargePerDay){
	ChargePerPay=chargePerDay;
	}
	public int getChargePerPay(){
	return ChargePerPay;
	}
	}
	interface HospitalBilling{
	 void calculateBill(Patient p);
	}
	class Bill implements HospitalBilling{
	public void calculateBill(Patient p){
	double TotalBill=(p.getDaysAdmitted() * p.getChargePerPay()) + 500;
	System.out.println("Total Bill="+TotalBill);
	}
	}
	public class InterfaceHospitalBillApp{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	
	Patient a=new Patient();
	System.out.println("ënter id");
	int id=in.nextInt();
	in.nextLine();
	System.out.println("enter name");
	String name=in.nextLine();
	System.out.println("ënter days");
	int days=in.nextInt();
	System.out.println("ënter charge per day");
	int charge=in.nextInt();
	a.setId(id);
	a.setName(name);
	a.setDaysAdmitted(days);
	a.setChargePerPay(charge);
	
	Bill b=new Bill();
	b.calculateBill(a);
	}
	}
	
	
	
	
	
