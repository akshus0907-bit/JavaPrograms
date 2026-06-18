/*Question 11: Write a java program to calculate the sum of digits in a number.
Input:

Number = 1234

Output:

Sum of digits = 10

Explanation:

The program separates each digit using modulus (%) and division (/).
Digits are 1, 2, 3, 4 and their sum is 1 + 2 + 3 + 4 = 10.*/

import java.util.*;
public class SumOfDigit{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=0;
		int sum=0;
		int r;
		if(n==0){
			sum=0;
			System.out.println(sum);
		}
		while(n>0){
			r=n%10;
			
			sum=sum+r;
			n=n/10;
			
			count++;
		}
		System.out.println(sum);
	}
}
			
		