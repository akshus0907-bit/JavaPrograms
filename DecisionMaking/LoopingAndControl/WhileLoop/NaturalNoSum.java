/*Question 6: Write a java program to find the sum of all natural numbers between 1 to n.
Input:

n = 5

Output:

Sum = 15

Explanation:

The program adds numbers from 1 to 5.
1 + 2 + 3 + 4 + 5 = 15.*/
import java.util.*;
public class NaturalNoSum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=1;
		int sum=0;
		while(count<=n){
			 sum=sum+count;
			 
			 count++;
			
		}
		 System.out.println(sum);
	}
}