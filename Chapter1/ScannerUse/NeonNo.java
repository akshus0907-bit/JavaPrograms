/*Question 24: Write a Java program to check whether a number is a Neon number or not.
Input:
9

Output:
Neon Number

Explanation:
A Neon number is a number where the sum of digits of its square is equal to the number itself.
9² = 81 ? 8 + 1 = 9.*/
import java.util.*;
public class NeonNo{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter a number:");
		int n=in.nextInt();
		int square=n*n;
		int sum=(square%10)+(square/10);
		String d=(n==sum)?"neon number":"not a neon number";
		System.out.println(d);
	}
}