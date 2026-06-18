/*34 Print even index elements*/

import java.util.*;
public class Q34{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				System.out.println(a[i]);
			}
		}
	}
}