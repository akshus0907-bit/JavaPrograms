/*Question 10: Write a java program to count the number of digits in a number
Input:

Number = 12345

Output:

Number of digits = 5

Explanation:

The program divides the number by 10 repeatedly until it becomes 0.
Each division reduces one digit, and a counter keeps track of total digits.*/

import java.util.*;
public class CountDigit{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=0;
		if(n==0){
			count=1;
		}
		while(n>0){
			n=n/10;
			
			count++;
		}
		System.out.println(count);
	}
}
			