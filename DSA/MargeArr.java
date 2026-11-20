/*Question 48: Write a java program to merge of two given array.
Input:
Array1 = [1, 2, 3, 4, 5]
Array2 = [6, 7, 8, 9, 10]

Output:
Merged Array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Explanation:
Copy all elements of the first array followed by elements of the 
second array into a new array.*/

import java.util.*;
public class MargeArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element in aaray");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in  first aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		
		System.out.println("enter number of element in aaray");
		int o=in.nextInt();
		int b[]=new int[o];
		
		System.out.println("enter element in second  aaray");
		for(int i=0;i<b.length;i++){
			b[i]=in.nextInt();
		}
		
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length){
			if(a[i]<b[j]){
				c[k++]=a[i++];
			}
			else{
				c[k++]=b[j++];
			}
		}
		while(i<a.length){
			c[k++]=a[i++];
		}
		while(j<b.length){
			c[k++]=b[j++];
		}
		for(int x=0;x<c.length;x++){
			System.out.println(c[x]);
		}
	}
}
				
		
		

