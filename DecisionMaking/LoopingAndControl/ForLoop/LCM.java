/*Question 37: Write a java program to find LCM of two numbers.
Input:

Number1 = 12
Number2 = 18

Output:

LCM = 36

Explanation:

LCM is the smallest number that is divisible by both 12 and 18.
36 is divisible by both numbers.*/

import java.util.*;
public class LCM{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int count=1;
		
			for(int i=1;i<=num1&&i<=num2;i++){
				if(num1%i==0&&num2%i==0){
				count=i;
				}
			}
				int lcm=(num1*num2)/count;
				System.out.println(lcm);
	}
}
			



			
			