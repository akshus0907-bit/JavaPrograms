/*Question 20: Write a Java program to compute the sum of digits of an integer.
Input:
123

Output:
6

Explanation:
Each digit is separated using modulus and division operations.
1 + 2 + 3 = 6.*/
import java.util.*;
public class SumOfDigit{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int first=(n%10);
		int rem=n/10;
		int second=rem%10;
		int last =n/100;
		int sum=last+second+first;
		System.out.println("sum of digit is =:"+sum);
		
	}
}