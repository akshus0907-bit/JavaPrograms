/*6. Write a Java program to demonstrate encapsulation using a `BankAccount` class with a private
`balance` variable.*/

 class BankAccount{
	 private int balance;
	 
	 public void deposite(int amount){
		 balance=balance+amount;
	 }
	 public void withdrawl(int amount){
		 if(balance>=amount){
			 balance=balance-amount;
		 }
		 else{
			 System.out.println("insufficaient balance");
		 }
	 }
	 public int getbalance(){
		 return balance;
	 }
	 
	 public static void main(String[]args){
		 
		 BankAccount b=new BankAccount();
		 b.deposite(200);
		 System.out.println("Balance after deposit: " +b.getbalance());
		 
		 b.withdrawl(400);
		 System.out.println("Balance after withdrawal: " +b.getbalance());
	 }
 }
		 