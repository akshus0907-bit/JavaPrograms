/*Question 11: Write a java program to find a maximum between three numbers.
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40

Explanation:
The program compares all three numbers using conditional statements.
If Number1 is greater than Number2 and Number3, then it is maximum.
Otherwise, compare Number2 and Number3 to find the largest value.*/

import java.util.*;
public class Max{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter three number");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		if(a>b &&a>c){
			System.out.println("max=:"+a);
		}
		else if(b>c){
			System.out.println("max=:"+b);
		}
		else{
			System.out.println("max="+c);
		}
	}
}