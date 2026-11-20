//Count the total number of subarrays

import java.util.*;

public class CountTotalSubArray{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size");
		int n=in.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter element");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				
					count++;
					
					
				
				
				
			}
		}
		System.out.println(count);
	}
}