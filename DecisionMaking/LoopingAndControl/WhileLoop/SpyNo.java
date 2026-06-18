/*Question 28: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Input:

Number = 1412

Output:

Spy Number

Explanation:

Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8
Since sum equals product, it is a Spy Number.*/

import java.util.*;
public class SpyNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int sum=0;
		int count=0;
		int product=1;
		int r;
		
		while(n>0){
			r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
			// count ++;
		}
		if(sum==product){
			System.out.println("number is spy number");
		}
		else{
			System.out.println("number is not spy number");
		}
	}
}
			