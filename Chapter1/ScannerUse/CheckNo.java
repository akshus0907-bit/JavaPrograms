/*Question 30: Write a Java program to check whether a number is a multiple of both 3 and 5.
Input:
15

Output:
Multiple of both 3 and 5

Explanation:
A number divisible by both 3 and 5 must give remainder 0 when divided by 3 and by 5.
The logical AND operator is used to check both conditions.*/
import java.util.*;
public class CheckNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number=");
		int n=in.nextInt();
		String a=(n%3==0 &&n%5==0)? "multiple of both 3 and 5":"not multile of both";
		System.out.println(a);
		
	}
}