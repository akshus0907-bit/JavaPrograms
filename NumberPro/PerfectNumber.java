/*Question: Write a Java program to check whether a number is a Perfect number.

Meaning: A number is perfect when the sum of its proper divisors (excluding itself) equals the number.

Example: \(6 = 1 + 2 + 3\)*/

import java.util.*;
public class PerfectNumber{
	public static  void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=in.nextInt();
		
		int sum=0;
		int i=1;
		while(i<n){
			if(n%i==0)
				sum=sum+i;
				
				i++;
			}
			if(n>1 &&  sum==n)
				System.out.println("perfect number");
			
			else
				System.out.println("number is not perfect");
		
	}
}
