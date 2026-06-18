/*Question 21: Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.
The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
Input:

Number = 7

Output:

Prime Number

Explanation:

7 is divisible only by 1 and 7.
Since it has exactly two factors, it is a prime number.

Input:

Number = 8

Output:

Not a Prime Number

Explanation:

8 is divisible by 1, 2, 4, and 8.
Since it has more than two factors, it is not a prime number.*/

import java.util.*;
public class PrimeNo{
	public static void main(String[]arge){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag){
			System.out.println("prime number");
		}
		else{
			System.out.println("not prime number");
		}
	}
}