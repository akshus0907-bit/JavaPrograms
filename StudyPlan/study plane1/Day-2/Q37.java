/*37 Find common elements in two arrays LC 349*/

import java.util.*;
public class Q37{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of first array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in  first array");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter size of second array");
		int m=in.nextInt();
		int b[]=new int[m];
		System.out.println("enter element in second array");
		for(int i=0;i<b.length;i++){
			 b[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
				}
			}
		}
	}
}
					