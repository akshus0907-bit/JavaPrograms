/*Q1.  Write a java program to check if a number is a happy number or not. */

import java.util.*;
public class Q1{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int temp=n;
		int r;
		
		while (n > 9) {// n is greater than 9
            int sum = 0;
		while(n>0){
			r=n%10;
			sum=sum+(r*r);   //n=19  0=(9*9)=81
			
			n=n/10;   // 81/10=1
		}
		n=sum;
		}
	
	if(n==1||n==7){
		System.out.println("number is happy  number "+temp);
	}
	else{
		System.out.println("number is not happy number=" +temp);
	}
	}
}
			
			
		