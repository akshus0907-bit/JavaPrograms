/*23 Find sum of elements LC 1480*/

import java.util.*;
public class Q23{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}