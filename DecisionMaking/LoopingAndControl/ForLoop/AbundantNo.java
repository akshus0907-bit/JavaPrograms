/*Question 44: Write a Java program to find all Abundant numbers up to n.
An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 ? sum = 16 > 12.
Explanation:
Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number.
Input:
n = 20

Output:
12 18 20

Explanation:
An Abundant number has sum of proper divisors greater than itself.
Example: 12 ? divisors sum = 16 > 12.*/

import java.util.*;
public class AbundantNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		
		for(int i=1;i<=n;i++){
			int sum=0;
			
			
		for(int j=1;j<=(i-1);j++){
			if(i%j==0){
				sum=sum+j;
			}
		}
		if(sum>i){
			System.out.println(i);
		}
		}
	}
}
			