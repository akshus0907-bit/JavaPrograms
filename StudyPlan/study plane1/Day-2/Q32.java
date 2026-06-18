/*32 Find second largest element LC 414*/

import java.util.*;
public class Q32{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of aaray");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int sc=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				sc=max;
				max=a[i];
				
			}
			
			else if(a[i] > sc && a[i] < max){
					sc = a[i];
			}
		}
		System.out.println(sc);
	}
}

		
		