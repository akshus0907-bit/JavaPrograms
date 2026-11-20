//find subarray whose sum equal to target 

import java.util.*;
public class SumEqualToTarget{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size");
		int n =in.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter elemetn");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		System.out.println("enter targte");
		int target=in.nextInt();
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int sum=0;
				
				for(int k=i;k<=j;k++){
					
					sum=sum+a[k];
				}
					
					if(sum==target){
						
						for(int k=i;k<=j;k++){
						System.out.println(a[k]);
						}
					}
					
				
				
				
				}
			}
		}
	}
