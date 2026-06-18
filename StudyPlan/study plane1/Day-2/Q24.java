/*24 Find average of array LC 1491*/

import java.util.*;
public class Q24{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		System.out.println(avg);
	}
}