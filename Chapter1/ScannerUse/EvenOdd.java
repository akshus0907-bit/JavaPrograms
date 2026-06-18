/*Question 31: Write a Java program to check whether a given number is even or odd.
Input:
Number = 12

Output:
Even

Explanation:
A number is even if it is divisible by 2 (remainder 0).
If the remainder is not 0, the number is odd.*/
import java.util.*;
public class EvenOdd{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n =in.nextInt();
		String c=(n%2==0)?"number is even":"number is odd";
		System.out.println(c);
	}
}