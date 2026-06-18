/*21 Find maximum element LC 414*/

import java.util.*;
public class Q21{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of aaray");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("max number is="+max);
	}
}
	