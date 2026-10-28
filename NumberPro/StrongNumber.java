/* Strong Number
Question: Write a Java program to check whether a number is a Strong number.

Meaning: A number is strong if the sum of the factorials of its digits equals the original number.

Example: \(145 = 1! + 4! + 5! = 145\)*/

import java.util.*;
public class StrongNumber{
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0){
			int digit=temp%10;
			int fact=1;
			int i=1;
			
			
			while(i<=digit){
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		
		if(n>=0 && sum==n)
			System.out.println("strong number");
		else
			System.out.println("not strong number");
	}
}