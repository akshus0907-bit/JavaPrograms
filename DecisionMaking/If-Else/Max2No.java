/*Question 17: Write a java program to find the maximum between two numbers.
Input:
Number1 = 45
Number2 = 30

Output
Maximum number = 45

Explanation:
If Number1 > Number2, print Number1.
Otherwise, print Number2.*/
import java.util.*;
public class Max2No{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a>b){
			System.out.println("max="+a);
		}
		else{
		    System.out.println("max="+b);
		}
	}
}
		