//Reverse the array 

import java.util.*;
public class ReverseArray{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("enter size of array");
		
		int n=in.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter element");
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		int start=0;
		int end=a.length-1;
		
		while(start<end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
		
		
		start++;
		end--;
		}
		
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		
	}
}

