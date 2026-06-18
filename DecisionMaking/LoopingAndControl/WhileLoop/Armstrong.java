/*Question 25: Write a java program to Check Number Is Armstrong Number or Not.

Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
Input:

Number = 153

Output:

Armstrong Number

Explanation:

153 has 3 digits.
1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
Since the result equals the original number, it is an Armstrong Number.*/
import java.util.*;
public class Armstrong{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
			System.out.println("enter number");
			int n=in.nextInt();
			
			int count=0;
			int temp=n;
			int r;
			
			int sum=0;
			
			while(n>0){
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
				count++;
			}
			if(sum==temp){
				System.out.println("number is Armstrong");
			}
			else{
				System.out.println("number is ot Armstrong");
			}
		}
	}

				