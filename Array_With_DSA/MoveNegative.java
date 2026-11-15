//move all negative element at last

import java.util.*;
public class MoveNegative{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size");
		int n=in.nextInt();
		
		int a[]=new int [n];
		System.out.println("enter element");
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		int j=0;
		
		for(int i=0;i<n;i++){
			if(a[i]>0){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		
	}
	
	for(int i=0;i<n;i++){
		System.out.println(a[i]);
	}
}
}