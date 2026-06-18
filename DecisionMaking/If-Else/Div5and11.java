/*Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
If number % 5 == 0 AND number % 11 == 0.*/

import java.util.*;
public class Div5and11{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		if(n%5==0 && n%11==0){
			System.out.println("number is divisible by 5 and 11");
		}
		else{
			System.out.println("number is not divisible by 5 and 11");
		}
	}
}