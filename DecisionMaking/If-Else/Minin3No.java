/*Question 16: Write a java program to find a minimum between three numbers.
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number.*/

import java.util.*;
public class Minin3No{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter three number");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a<b&&a<c){
			System.out.println("minimum="+a);
		}
		else if(b<c){
			System.out.println("minimum="+b);
		}
		else{
			System.out.println("minimum="+c);
		}
	}
	
}
