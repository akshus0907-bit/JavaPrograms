//find second largest element

import java.util.*;
public class SecondLarge{
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size");
		int n =in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		int max=a[0];
		int smax=a[0];
		
		for(int i=0;i<n;i++){
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else{
				if(smax>a[i] && a[i]!=max){
					smax=a[i];
				}
			}
		}
		System.out.println(smax);
	}
		

}