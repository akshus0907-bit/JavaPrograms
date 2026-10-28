/* Neon Number
Question: Write a Java program to check whether a number is a Neon number.

Meaning: A number is Neon if the sum of the digits of its square equals the original number.

Example: \(9^2 = 81\), and \(8 + 1 = 9\).*/



import java.util.*;
public class NeonNumber{
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter number");
	int n=in.nextInt();
	
	int sqt=n*n;
	int sum=0;
	
	while(sqt>0){
		int digit=sqt%10;
		sum=sum+digit;
		sqt=sqt/10;
	}
	
	if(n>0 && sum==n)
		System.out.println("neon number");
	
	else
		System.out.println("not neon number");
}
}