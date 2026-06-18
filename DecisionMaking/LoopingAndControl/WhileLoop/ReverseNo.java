/*Question 13: Write a java program to enter a number and print its reverse.
Input:

Number = 1234

Output:

Reversed Number = 4321

Explanation:

The program extracts the last digit and builds the reverse number.
Each digit is added in reverse order.*/

import java.util.*;
public class ReverseNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		int count=0;
		int rev=0;
		
		
		int r;
		
		if(n==0){
			rev=0;
		}
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
			count++;
		}
		System.out.println(rev);
	}
}
			