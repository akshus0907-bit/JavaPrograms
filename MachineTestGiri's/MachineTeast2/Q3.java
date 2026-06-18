/*Q3.  Write a java program to display 1 to nth Armstrong Number.*/ 

import java.util.*;
public class Q3{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		
		for(int i=1;i<n;i++){
			int temp=i;
		   int r,sum=0;
		
		while(temp>0){
		r=temp%10;       //153%10=3
		sum=sum+(r*r*r);     //sum=0+27=27
		temp=temp/10;       //153/10=15
		}
		if(sum==i){
			System.out.println(i);
		}
		}
	}
}
		