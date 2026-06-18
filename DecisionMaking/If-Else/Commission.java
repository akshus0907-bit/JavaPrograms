/*Question 40: Calculate commission based on sales amount:
? Input: Sales amount
? Logic:
? Sales < 5000 ? 2% commission
? Sales 5000–10000 ? 5% commission
? Sales > 10000 ? 10% commission
? Output: Display commission amount.
Input:
Sales = 12000

Output:
Commission = 1200

Explanation:

Sales < 5000 ? 2%
5000–10000 ? 5%
10000 ? 10%
12000 × 10% = 1200*/

import java.util.*;
public class Commission{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter sales");
		int sales=in.nextInt();
		
		int commission=0;
		if(sales<5000){
			commission=(sales*2)/100;
			System.out.println(commission);
		}
		else if(sales>=5000 && sales<=10000){
			commission=(sales*5)/100;
			System.out.println(commission);
		}
		else if(sales>10000){
			commission=(sales*10)/100;
			System.out.println(commission);
		}
		else{
			System.out.println("invalid input");
		}
	}
}