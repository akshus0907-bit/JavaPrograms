/*Question 12: Write a java program to calculate the product of digits in a number.
Input:

Number = 1234

Output:

Product of digits = 24

Explanation:

Digits are extracted one by one.
1 × 2 × 3 × 4 = 24.*/

import java.util.*;
public class ProductOfDigit{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int product=1;
		int r;
		int count=0;
		if(n==0){
			product=0;
		}
		while(n>0){
			r=n%10;
			product=product*r;
			n=n/10;
			count++;
		}
		System.out.println(product);
	}
}

			
			