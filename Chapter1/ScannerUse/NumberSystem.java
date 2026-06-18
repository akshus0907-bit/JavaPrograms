/*Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
Input:
456

Output:
First = 4
Last = 6

Explanation:
The first digit is obtained by dividing the number by 100.
The last digit is obtained using the modulus operator (% 10).*/

import java.util.*;
public class NumberSystem{ 
		public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=in.nextInt();
		int first=(n/100);
		int last=(n%10);
		System.out.println("first and last digit is =:"+first+ " "+last);
	}
}