/*Question 41: Write a Java program to find the largest and smallest digit of a given number.
Explanation:
Use a while loop to extract digits, compare each digit to track max and min.
Input:

Number = 583902

Output:

Largest Digit = 9
Smallest Digit = 0

Explanation:

The program extracts each digit using a while loop.
Each digit is compared to track maximum and minimum values.*/

import java.util.*;
public class MinMaxDigit{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		for(int i=0;i<=n;i++){
			
		int largest=0;
		int smallest=9;
		while(n>0){
			int a=n%10;
			if(a>largest){
				largest=a;
			}
			if(a<smallest){
				smallest=a;
			}
			n=n/10;
		}
		System.out.println("largest="+largest);
		System.out.println("smallest="+smallest);
		}
	}
}