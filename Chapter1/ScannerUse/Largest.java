/*Question 53: Write a Java program to print the larger digit between first and last digit of a three-digit number.
Input:
Number = 582

Output:
Larger Digit = 5

Explanation:
First digit = 5
Last digit = 2
Since 5 > 2, the larger digit is 5.*/

import java.util.*;
public class Largest{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a three digit");
		int n =in.nextInt();
		int lastDigit=n%10;
		int firstDigit=n/100;
		if(firstDigit>lastDigit){
			System.out.println("largest="+firstDigit);
		}
		else{
			System.out.println("larget is="+lastDigit);
		}
	}
}
		