/*Question 113: Write a Java program to implement an online payment system using interface
Asked In Practice Assignment
Create an interface Payment with method pay().
Implement classes UPI and NetBanking.
Display payment method based on user choice.

Input:
Enter choice (1-UPI, 2-NetBanking): 1
Enter amount: 1500

Output: Paid 1500 using UPI*/

import java.util.*;
 interface Payment{
	 void pay();
 }
 class UPI implements Payment{
	 double amount;
	 UPI(double amount){
		 this.amount=amount;
	 }
	 
	 public void pay(){
		 System.out.println("paid" +amount+"using UPI");
	 }
 }
 class NetBanking implements Payment{
	 double amount;
	 NetBanking(double amount){
		 this.amount=amount;
	 }
	 public void pay(){
		 System.out.println("paid"+amount+" using NetBanking");
	 }
 }
 public class InterfacePaymentApp{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 Payment p;
		 System.out.println("enter your choice \n1.UPI \n2.NetBanking");
		 int choice=in.nextInt();
		 
		 switch(choice){
			 case 1:
			 System.out.println("enter amount");
			 double amount=in.nextDouble();
			 p=new UPI(amount);
			 p.pay();
			 break;
		    
			case 2:
			System.out.println("enter amount");
			double amount1=in.nextDouble();
			p=new NetBanking(amount1);
			p.pay();
			break;
			
			default:
			System.out.println("invalid choice");
		 }
	 }
 }
 
			 
		 
	 