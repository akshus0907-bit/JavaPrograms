/*Question 21: Write a Java program to reverse a number without using a loop.
Input:
123

Output:
321

Explanation:
Digits are separated using arithmetic operations and rearranged in reverse order without using loops.*/
import java.util.*;
public class ReverseNo{

	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number :=");
		int no = in.nextInt();
		int rev=(no%10)*100+(no/10)%10*10+(no/100);
		System.out.println("reverse is =:"+rev);
		
	}
}