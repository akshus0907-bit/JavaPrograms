/*Question 16: Write a Java program to print the ASCII value of a given character
Input:
Character = A

Output:
ASCII value = 65

Explanation:
Every character has a unique ASCII value. When a character is typecast to an integer, its ASCII value is obtained. The ASCII value of 'A' is 65*/
import java.util.*;
public class asciiValue{
	public static void main(String x[]){
		Scanner in= new Scanner (System.in);
		System.out.println("Enter any character:");
		char ch =in.next().charAt(0);
		int a = ch;
		System.out.println("ASCII value is = "+a);
		
	}
}
	