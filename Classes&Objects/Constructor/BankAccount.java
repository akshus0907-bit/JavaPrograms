/*Question 10: Write a Java program to create a BankAccount class and check minimum balance condition.

Description: Create BankAccount class with accountNumber, customerName and balance.
 Initialize using constructor. If balance < 1000 display Minimum Balance Warning otherwise Valid Balance.
INPUT:
Enter Account Number: 12345
Enter Customer Name: Suresh
Enter Balance: 800

OUTPUT:
Customer Name: Suresh
Status: Minimum Balance Warning

EXPLANATION:
Create BankAccount with fields accountNumber, customerName, balance. 
Use constructor to initialize. Check if balance < 1000 then print "Minimum Balance Warning" 
else "Valid Balance". Display customer name and status.*/
import java.util.*;
public class BankAccount{
	private int AccountNo;
	private String CustomerName;
	private int Balance;
	
	BankAccount(int a,String n,int b){
		AccountNo=a;
		CustomerName=n;
		Balance=b;
	}
	void display(){
		System.out.println("customer name="+CustomerName);
		if(Balance<1000){
			System.out.println("Minimum balance warning");
		}
		else{
			System.out.println("valid balance");
		}
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out .println("enter account number");
		int acc=in.nextInt();
		in.nextLine();
		System.out.println("enter customer name");
		String name=in.nextLine();
		System.out.println("enter balance");
		int balance=in.nextInt();
		
		BankAccount b=new BankAccount(acc,name,balance);
		b.display();
	}
}
		