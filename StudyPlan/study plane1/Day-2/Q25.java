/*25 Reverse an array LC 344*/

import java.util.*;
public class Q25{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int left=0;
		int right=a.length-1;
		while(left<right){
			int temp=a[right];
			a[right]=a[left];
			a[left]=temp;
			left++;
			right--;
		}
		System.out.println("reverse array");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
	}
}
}
		