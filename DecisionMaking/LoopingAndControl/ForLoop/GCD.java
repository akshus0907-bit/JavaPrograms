/*Question 36: Write a java program to find HCF (GCD) of two numbers.
Input:

Number1 = 12
Number2 = 18

Output:

HCF = 6

Explanation:

6 is the largest number that divides both 12 and 18 without remainder.
Therefore, HCF is 6.*/

import java.util.*;
public class GCD{
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
				System.out.println(count);
		}
	}
			



