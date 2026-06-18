/*Question 14: Write a Java program to swap two numbers using a third variable.
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers.*/
import java.util.*;
public class SwapNumber{
	public static void main(String x[]){
		Scanner in =new Scanner(System.in);
		System.out.println("enter two number :");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("before swaping two number = "+a+" " +b);
	
		int swap=a;
		a=b;
		b=swap;
		System.out.println("after swaping two number ="+a+ " " +b);
		
	}
}