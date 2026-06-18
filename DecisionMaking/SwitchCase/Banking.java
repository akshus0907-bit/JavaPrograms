/*Question 59: Develop a program to simulate a basic banking menu:
1: Deposit
2: Withdraw
3: Check Balance
4: Exit
Use a switch to handle user choice and print appropriate messages.
Input:
Choice = 1 (Deposit)
Amount = 2000

Output
Amount Deposited. New Balance = 7000

Explanation:
When choice 1 is selected, deposit amount is added to balance.

Input:
Choice = 3

Output:
Current Balance = 5000

Explanation:
Choice 3 prints the current account balance.*/

import java.util.*;

public class Banking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       
        int balance = 5000; 
        
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
        System.out.print("Enter choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                int deposit = in.nextInt();
                balance = balance + deposit; 
                System.out.println("Amount Deposited. New Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = in.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw; 
                    System.out.println("Withdraw Successful. New Balance = " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 3:
                
                System.out.println("Current Balance = " + balance);
                break;

            case 4:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
