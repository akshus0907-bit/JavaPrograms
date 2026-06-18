/*Question 35: Write a Java program to check whether a number is divisible by both 5 and 11.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
A number divisible by both 5 and 11 must give remainder 0 when divided by 5 and 11.*/

import java.util.*;
public class NoDivisible5or11{
		public static void main(String[]args){
			Scanner in=new Scanner(System.in);
			System.out.println("enter a number");
			int n=in.nextInt();
			String s=(n%5==0&&n%11==0)?"divisible by 5 and 11":"not divisible";
		System.out.println(s);
		}
	}
	