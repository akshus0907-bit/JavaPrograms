/*Question 43: Write a Java program to accept two integers and check whether they are equal.
Input:
A = 50
B = 50

Output:
Equal

Explanation:
If both numbers have the same value, they are equal; otherwise, they are not equal.

Asked In Companies:*/
import java.util.*;
public class CheckNumber{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		 String d=(a==b)? "equal":"not equal";
		 System.out.println(d);
	}
}
		