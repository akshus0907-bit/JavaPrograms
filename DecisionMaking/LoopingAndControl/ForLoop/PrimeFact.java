/*Question 38: Write a java program to find all prime factors of a number.
Input:

Number = 20

Output:

Prime Factors: 2 2 5

Explanation:

20 = 2 × 2 × 5
All these factors are prime numbers.*/

import java.util.*;
public class PrimeFact{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number:");
		int n=in.nextInt();
		
		for(int i=2;i<=n;i++){
			while(n%i==0){
				System.out.println(i);
				n=n/i;
			}
		}
	}
}
		