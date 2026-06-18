/*30 Copy array elements*/

import java.util.*;
public class Q30{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		System.out.println("enter element");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int b[]=new int [a.length];
		
		
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
			