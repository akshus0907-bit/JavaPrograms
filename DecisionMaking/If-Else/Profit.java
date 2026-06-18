/*Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss*/
import java.util.*;
public class Profit{
	public static void main(String []args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter cost and selling price");
		int selling =in.nextInt();
		int cost=in.nextInt();
		if (selling>cost){
			System.out.println("profit");
		}
		else{
			System.out.println("loss");
		}
	}
}