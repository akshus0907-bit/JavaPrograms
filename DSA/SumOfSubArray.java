//find the sum of every sub array

import java.util.*;
public class SumOfSubArray{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size");
		int size=in.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter elemetn");
		
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int sum=0;
				
				for(int k=i;k<=j;k++){
					sum=sum+a[k];
				}
				System.out.println(sum);
			}
		}
	}
}