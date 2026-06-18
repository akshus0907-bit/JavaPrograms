/*Question 27: Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps
 wherein each step number is replaced by the sum of squares of its digit,
 that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
Input:

Number = 19

Output:

Happy Number

Explanation:

1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
Since it reaches 1, it is a Happy Number.*/

import java.util.*;
public class HappyNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(;n!=1 && n!=4;){
			int sum=0;
			
			for(int i=n;i>0;i=i/10){
				int digit=i%10;
				sum=sum+(digit*digit);
			}
			n=sum;
		}
		if(n==1){
			System.out.println("number is happy number");
		}
		else{
			System.out.println("number is not happy number");
		}
	}
}
				