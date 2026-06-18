/*Question 26: Write a Java program to check whether a number is a Spy number.
Input:
1412

Output:
Spy Number

Explanation:
A Spy number is a number where the sum of digits equals the product of digits.
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8.*/

import java.util.*;
public class SpyNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=in.nextInt();
		int sum=(n%10)+(n/10)%10+(n/100)%10+(n/1000);
		int product=(n%10)*((n/10)%10)*((n/100)%10)*(n/1000);
		System.out.println("sum is ="+sum);
		System.out.println("product is="+product);
		String s= (sum==product)?"spy number":"not a spy number";
		System.out.println(s);

		
		
		
	}
}