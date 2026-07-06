/*Question 4: Create a base class Account with accountNumber and balance.
Create a child class SavingsAccount that adds interestRate.
Calculate final balance after adding interest.
Asked In Practice Assignment
Description
This program uses inheritance to simulate a banking system.
The child class extends functionality by applying interest calculation.

Input
Enter Account Number: 12345
Enter Balance: 10000
Enter Interest Rate: 5

Output
Account Number: 12345
Initial Balance: 10000
Interest: 500
Final Balance: 10500*/

import java.util.*;
	class Account{
	int accountNumber;
	int balance;
	Scanner in=new Scanner(System.in);
	void data(){
	System.out.println("enter account number");
	accountNumber=in.nextInt();
	System.out.println("enter balance");
	balance=in.nextInt();
	}
	void display(){
	System.out.println("account number="+accountNumber);
	System.out.println("initial Balance="+balance);
	}
	}
	class SavingsAccount extends Account {
    double interestRate;

    void dataInterest() {
        System.out.print("Enter Interest Rate: ");
        interestRate = in.nextDouble();
    }

    void calculateFinalBalance() {
        double interest = (balance * interestRate) / 100;
        double finalBalance = balance + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Final Balance: " + finalBalance);
    }
}
	
	public class AccountApp{
		public static void main(String[]args){
	SavingsAccount s=new SavingsAccount();
	s.data();
	s.dataInterest();
	s.display();
	
	s.calculateFinalBalance();
	}
	}
	