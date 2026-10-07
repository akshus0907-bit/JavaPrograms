/*8. Write a Java program to demonstrate Data Hiding using the private access modifier. Create a 
BankAccount class with a private balance and methods to deposit and display the balance. */

import java.util.*;
class BankAccount{
	private int balance;
	
	void deposite(int amount){
		
		
		balance=balance+amount;
	}
	void display(){
		System.out.println(balance);
		
	}
}

public class DataHiding{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
        System.out.println("Enter amount:");
        int amount = in.nextInt();
		BankAccount b=new BankAccount();
		b.deposite(amount);
		b.display();
	}

}
	