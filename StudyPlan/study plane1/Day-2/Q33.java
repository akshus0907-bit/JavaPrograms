/*33 Remove duplicate elements LC 26*/

import java.util.*;
public class Q33{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int result[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			boolean flag=false;
			for(int j=0;j<k;j++){
				if(result[j]==a[i]){
					flag=true;
					break;
				}
			}
			if(flag==false){
				result[k]=a[i];
				k++;
			}
		}
		
		for(int i=0;i<k;i++){
			System.out.println(result[i]);
		}
	}
}