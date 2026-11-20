//Find the maximum subarray sum

import java.util.*;
public class MaxSubArraySum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size");
		int n=in.nextInt();
		
		int a[]=new int [n];
		
		System.out.println("enter element");
		int max=0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum=sum+a[k];
				}
				if(sum>max){
					max=sum;
				}
					
				}
				
				
			}
			
			System.out.println(max);
		}
	}
