/*6. Take a number and reverse it. Check whether it is a palindrome. If it is a palindrome, additionally
check whether it is divisible by 3 and 5.*/

import java.util.*;
public class PalinderomeNum{
	public static void  main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number");
		int n=in.nextInt();
		
		int temp=n;
		int rev=0;
		while(n>0){
			
		   int digit=n%10;
		   rev=rev*10+digit;
		   n=n/10;
		}
		   if(temp==rev){
			   System.out.println("number is palindrome: "+rev);
		   }
		   
		      if(n%3==0){
			   System.out.println("number is divided by 3");
		   }
		      else if(n%5==0){
			   System.out.println("number is divided by 5");
		   }
		   else {
			   System.out.println("number is not palindrome not didvide by 3 and 5");
		}
	}

}
		   
		 
		 