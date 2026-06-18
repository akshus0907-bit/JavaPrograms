 /*Q2:Write a Java program to reverse a number without using loop.  
Input a number: 123  
Reverse number: 321 */

import java.util.*;
public class ReverseNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number"); //n=123
		int n=in.nextInt();
		int r;                       //reminder
		int rev=0;
		
		if(n==0){
			System.out.println("rev="+rev);
		}
		
		r=n%10;               //123%10 =3 separeted last digit
		rev=rev*10+r;           //stored 3 as a reverse
		n=n/10;                    //123/10 =12 remover last digit
		
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		System.out.println("reverse Number ="+rev);
	}
}