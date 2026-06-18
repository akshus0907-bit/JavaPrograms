/*Question 58: Write a Java program to display the following series:
2 6 12 20 30 42 56 72 90 110
(n(n+1) pattern multiplied by 2)*
Input:
n = 10

Output:
2 6 12 20 30 42 56 72 90 110

Description:
The pattern follows:
n × (n + 1)

Example:
1×2=2
2×3=6
3×4=12*/
import java.util.*;
public class Q58{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println((i*(i+1)));
		}
	}
}