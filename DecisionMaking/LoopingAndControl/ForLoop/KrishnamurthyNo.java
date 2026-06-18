/*Question 47: Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
Example: 145 ? 1! + 4! + 5! = 145.
Explanation:
Use loops :
? Outer loop for numbers from 1 to n.
? Inner loop to extract digits and compute each digit’s factorial with another nested loop.
? Sum and compare with the original number.
Input:

Number = 145

Output:

Krishnamurthy Number

Explanation:

1! + 4! + 5! = 145
Since sum equals number, it is Krishnamurthy.*/

import java.util.*;
public class KrishnamurthyNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int sum=0;
		for(int i=n;i>0;i=i/10){
			int rem=i%10;
			int fact=1;
			
			for(int j=1;j<=rem;j++){
				fact=fact*j;
				
				
			}
		
		
		sum=sum+fact;
		}
		if(sum==n){
			
			System.out.println(" Krishnamurthy number");
		}
		else{
			System.out.println(" not Krishnamurthy number");
		}
	}
}
				