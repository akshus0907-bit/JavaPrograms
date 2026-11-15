//print all possible subarray

import java.util.*;
public class SubArray{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size=in.nextInt();
		
		int a[]=new int [size];

			System.out.println("enter element");
			for(int i=0;i<size;i++){
				a[i]=in.nextInt();
			}
			for(int i=0;i<a.length;i++){
				for(int j=i;j<a.length;j++){
					for(int k=i;k<j;k++){
						
						
						System.out.println(a[k]+" ");
						
						System.out.println("=========================================");
						
					
					}
				}
			}
	}
}