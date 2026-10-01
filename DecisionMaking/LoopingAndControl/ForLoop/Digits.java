/*3. Take a number and find its largest digit, smallest digit, sum of digits, and count of even and odd
digits using loops and if-else.*/

import java.util.*;
public class Digits{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		int ecount=0;
		int ocount=0;
		int sum=0;
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		while(n>0){
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			
			if(digit>largest){
				largest=digit;
		   }
		    if(digit<smallest){
			   smallest=digit;
		   }
		    if(digit%2==0){
				ecount++;
			}
			else{
				ocount++;
			}
		}
		System.out.println(sum);
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(ecount);
		System.out.println(ocount);
		
				
		
		
	}
}
			
