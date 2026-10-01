/*4. Take a number and repeatedly find the sum of its digits until a single-digit number is obtained.
Check whether the final digit is even or odd.*/

import java.util.*;
public class CheckDigitEvenOdd{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		
		int sum=0;
		while(n>0){
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		
		}
		System.out.println(sum);
		if(sum%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}
}
		