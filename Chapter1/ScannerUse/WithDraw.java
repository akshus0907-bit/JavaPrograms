/*Question 58: Problem
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's 
account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
Output
Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.
Input:
30 120.00

Output:
89.50

Explanation:
Withdrawal is allowed only if:

Amount is multiple of 5

Balance ? (withdrawal + 0.50 charge)

120 ? (30 + 0.50) = 89.50

If conditions fail, the original balance remains unchanged.*/

import java.util.*;
public class WithDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("enter witdraw and balance amount");

        int withdraw = in.nextInt();
        double balance = in.nextDouble();

        if (withdraw % 5 == 0 && balance >= withdraw + 0.50) {
            balance = balance - withdraw - 0.50;
        }

        System.out.printf("%.2f", balance);
    }
}