/*Question 17: Write a java program to find all factors of a number.
Input:

Number = 12

Output:

Factors: 1 2 3 4 6 12

Explanation:

A factor divides the number completely without remainder.
All numbers that divide 12 exactly are printed.*/
import java.util.*;
public class Fact{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		int fact=1;
		while(fact<=n){
			if(n%fact==0){
				System.out.println(fact);
			}
			fact++;
		}
	}
}
			