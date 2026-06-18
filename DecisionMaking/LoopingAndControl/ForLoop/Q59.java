/*Question 59: Write a Java program to display the following series:
100 81 64 49 36 25 16 9 4 1
(Perfect squares in reverse order)
Input:
n = 10

Output:
100 81 64 49 36 25 16 9 4 1

Description:
This is reverse square series:
10², 9², 8² … 1*/
import java.util.*;
public class Q59{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=n;i>=1;i--){
			System.out.println(i*i);
		}
	}
}