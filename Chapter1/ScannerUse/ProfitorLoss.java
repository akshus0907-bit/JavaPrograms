/*Question 37: Write a Java program to input cost price and selling price and determine profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If selling price > cost price ? Profit
If selling price < cost price ? Loss
If both are equal ? No Profit No Loss*/

import java.util.*;
public class ProfitorLoss{
	public static void main (String[]args){
		Scanner in =new Scanner (System.in);
		System.out.println("enter sellin price and cost price");
		int sell=in.nextInt();
		int cost=in.nextInt();
		
	if(sell>cost){
		System.out.println("profit");
	}
	else if(cost>sell){
		System.out.println("loss");
	}
	else{
		System.out.println("no profit no loss");
	}
	}
}