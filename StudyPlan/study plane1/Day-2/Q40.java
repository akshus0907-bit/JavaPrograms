/*40 Move zeros to end LC 283*/

import java.util.*;
public class Q40{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int index=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				a[index]=a[i];
				index++;
			}
		}
		for(int i=index;i<a.length;i++){
			a[i]=0;
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}