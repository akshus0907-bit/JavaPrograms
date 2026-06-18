/*Question 29: Write a Java program to implement a Bank Balance Validator using POJO class.
Create a POJO class Account with variables accountNumber and balance.
Using getter and setter methods:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 87654
Enter Balance : 4200

Output:
Account Number : 87654
Balance : 4200
Status : Low Balance Warning

Explanation:
A POJO class Account has private fields: accountNumber and balance.
Setter methods accept user input. Getter methods are used in the logic block.
If-else ladder:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4200 < 5000, Status = Low Balance Warning.
This models a real banking classification system using POJO principles.*/

import java.util.*;
public class BankBalance{
	private int AccountNo;
	private int Balance;
	
	public void setAccountNo(int ac){
		AccountNo=ac;
	}
	public void setBalance(int b){
		Balance=b;
	}
	public int getAccountNo(){
		return AccountNo;
	}
	public int getBalance(){
		return Balance;
	}
	public String getStatus(){
		if(getBalance()>=10000){
			return "Premium Account";
		}
		else if(getBalance()>=5000 && getBalance()<=9999){
			return "Normal Account";
		}
		else {
			return "low balance warning";
		}
	}
	public static void main(String[]args){
		BankBalance bb=new BankBalance();
		Scanner in=new Scanner(System.in);
		System.out.println("enter Account number");
		int AccountNo=in.nextInt();
		System.out.println("enter balance");
		int Balance=in.nextInt();
		 bb.setAccountNo(AccountNo);
		 bb.setBalance(Balance);
		 
		 System.out.println("--------------------------------");
		 System.out.println("Account No="+bb.getAccountNo());
		 System.out.println("Balance="+bb.getBalance());
		 System.out.println("Status="+bb.getStatus());
	}
}
		
			

