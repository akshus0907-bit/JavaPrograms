/*Question 15: Write a Java program to swap two numbers without using a third variable.
Input:
A = 4
B = 7

Output:
A = 7
B = 4

Explanation:
Swapping is done using arithmetic operations such as addition and subtraction without using an extra variable.*/
import java.util.*;
public class SwapNumberWithoutUsingThird{
	public static void main(String x[]){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number:");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("befor swaping number :" +a+ " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping number :"+a+ " "+b);
	}
}
		