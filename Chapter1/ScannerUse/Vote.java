/*Question 42: Write a Java program to check whether a person is eligible to vote.
Input:
Age = 19

Output:
Eligible to Vote

Explanation:
The minimum voting age is 18 years.
If age ? 18, the person is eligible0.*/

import java.util.*;
public class Vote{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter a age");
		int age =in.nextInt();
		String d=(age>=18)? "eligible to vote":"not eligible to vote";
		System.out.println(d);
	}
}