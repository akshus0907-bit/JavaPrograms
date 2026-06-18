/*Question 60: Write a Java program to display the following series:
3 6 12 24 48 96 192
(Each term doubles from the previous term starting at 3)
Input:
n = 7

Output:
3 6 12 24 48 96 192

Description:
Each term is double of previous term.
Formula:
next = previous × 2*/
import java.util.*;
public class Q60{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		int previous=3;
		for(int i=1;i<=n;i++){
			System.out.println(previous);
			previous=previous*2;
			
		}
	}
}