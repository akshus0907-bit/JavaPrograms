/*Question 52: Write a Java program to check eligibility based on percentage and income.
Input:
Percentage = 78
Income = 180000

Output:
Eligible

Explanation:
Eligibility condition:
Percentage ? 75 and Income < 200000.
Both conditions are satisfied.*/

import java.util.*;
public class Eligibility{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter percentae and income");
		int percentage=in.nextInt();
		int income=in.nextInt();
		
		if(percentage>=75 && income>=200000){
			System.out.println("eligible");
		}
		else{
			System.out.println("not eligible");
		}
	}
}
		