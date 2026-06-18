/*Question 53: Write a java program to display following series :
1 4 9 16 25 36 49 64 81 100
Input:

n = 10

Output:

1 4 9 16 25 36 49 64 81 100

Description:

This is a perfect square series.
Each term is square of natural numbers:
1², 2², 3², 4² … n²*/
import java.util.*;
public class Q53{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i*i);
		}
	}
}