//selection sort

import java.util.*;

public class SelectionSort{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		int a[]={10,20,30,5,6};
		
		System.out.println("array before sort" );
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
		
		for(int i=0;i<a.length;i++){
			for(int j=(i+1);j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("arrya after sort");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}