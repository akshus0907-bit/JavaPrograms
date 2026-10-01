/*1. Take n numbers from the user and count how many are positive, negative, and zero. Also print the
largest positive number and smallest negative number.*/

import  java.util.*;
public class Printnumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter count of number");
		int n=in.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter number");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int pcount=0;
		int ncount=0;
		int zcount=0;
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++){
			if( a[i]>0){
				pcount++;
				
				if(a[i]>max){
					max=a[i];
					
				}
			}
			else if(a[i]<0)	{
				ncount++;
				
				if(a[i]<min){
				 min=a[i];
				}
			}
			
			else {
				zcount++;
			}
		}
		System.out.println("positive count"+pcount);
		System.out.println("negative count"+ncount);
		System.out.println("zero count "+zcount);
	}
}
			