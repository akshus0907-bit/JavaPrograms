/*Question 123: Write a Java program to implement multi-account banking system using interface
Asked In Practice Assignment
Create a POJO class Account with fields accNo, name, balance, and accountType.
Create an interface BankService with methods deposit() and withdraw().

Savings ? minimum balance ?1000
Current ? no restriction
Validate withdrawal accordingly.

Input:
Enter accNo: 111
Enter name: abc
Enter balance: 2000
Enter type: Savings
Enter withdraw amount: 1500

Output:
Withdrawal Denied (Minimum Balance Required)*/

import java.util.*;
class Account{
	private int AccNo;
	private String Name;
	private double Balance;
	private String AccType;
	
	public void setAccNo(int accno){
		AccNo=accno;
	}
	public int getAccNo(){
		return AccNo;
	}
	public void setName(String name){
		Name=name;
	}
	public String getName(){
		return Name;
	}
	public void setBalance(double balance){
		Balance=balance;
	}
	public double getBalance(){
		return Balance;
	}
	public void setAccType(String acctype){
		AccType=acctype;
	}
	public String getAccType(){
		return AccType;
	}
}
 interface BankService{
	 
	 void deposit(Account a , double amount);
	 void withdraw(Account a , double amount);
 }
 class AccountApp implements BankService{
	 public void deposit(Account a ,double amount){
		 a.setBalance(a.getBalance()+amount);
		 System.out.println("deposite successful");
		 System.out.println("Balance="+a.getBalance());
	 }
	 public void withdraw(Account a,double amount){
		 if(a.getAccType().equalsIgnoreCase("saving")){
			 if((a.getBalance()-amount)>=1000){
				 a.setBalance(a.getBalance()-amount);
				 System.out.println("withdraw successful");
				 System.out.println("balance="+a.getBalance());
			 }
			 else{
				 System.out.println("withdrawal denied (minimum balance requrired)");
			 }
		 }
		 else if(a.getAccType().equalsIgnoreCase("current")){
			 a.setBalance(a.getBalance()-amount);
			 System.out.println("withdrawal successful");
			 System.out.println("balance="+a.getBalance());
		 }
		 else{
			 System.out.println("invalid acount type");
		 }
	 }
 }
public class InterfaceMultiAccbankingSystemApp{
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Account a = new Account();

        System.out.print("Enter Account No : ");
        int accNo = in.nextInt();
        in.nextLine();

        System.out.print("Enter Name : ");
        String name = in.nextLine();

        System.out.print("Enter Balance : ");
        double balance = in.nextDouble();
        in.nextLine();

        System.out.print("Enter Account Type (Savings/Current) : ");
        String type = in.nextLine();

        System.out.print("Enter Withdraw Amount : ");
        double withdrawAmount = in.nextDouble();

        a.setAccNo(accNo);
        a.setName(name);
        a.setBalance(balance);
        a.setAccType(type);

        AccountApp app = new AccountApp();

        app.withdraw(a, withdrawAmount);
    }
} 