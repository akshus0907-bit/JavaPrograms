/*Question 57: Write a Java program to display the following series:
1 1 2 3 5 8 13 21 34
(Fibonacci series using loop — first 9 terms)
Input:

n = 9

Output:

1 1 2 3 5 8 13 21 34

Description:

Each number is the sum of previous two numbers.
Formula:
next = first + second*/

import java.util.*;
public class Q57{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=0;
		int first=1;
		int second=1;
		 System.out.print(first + " " + second + " ");
		
		for(int i=3;i<=n;i++){
			int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
		}
	}
}