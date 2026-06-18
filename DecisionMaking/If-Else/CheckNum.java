/*Question 4: Write a Java program to check whether a number is positive, negative or zero.
Input:
Number = -5

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero*/

import java.util.*;
public class CheckNum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		
		if(n>0){
			System.out.println("number is positive");
		}
		else if(n<0){
			System.out.println("number is negative");
		}
		else{
			System.out.println("number is zero");
		}
	}
}