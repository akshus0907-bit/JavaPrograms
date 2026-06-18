/*Question 13: Write a java program to accept two integers and check whether they are equal or not.
Input:
Number1 = 15
Number2 = 15

Output
Both numbers are equal

Explanation:
If Number1 == Number2, print equal.
Otherwise, print not equal.*/

import java.util.*;
public class CheckEqualNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		
		if(a==b){
			Sysrem.out.pritln("both number are equals");
		}
		else{
			System.out.println("not equals");
		}
	}
}