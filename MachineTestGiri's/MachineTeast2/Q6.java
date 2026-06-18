/*Q6. Write a java program to merge of two given array. 
Input :- First Array :- 1 2 3 4 5       
         Second Array :-  6 7 8 9 10   
	
Output :- 1 10 2 9 3 8 4 7 5 6 */

import java.util.*;
public class Q6{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter element of first aaray"); 
		
		int a[]=new int[3];    //take input
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter array if Second element");
		
		int b[]=new int[5];
		for(int i=0;i<b.length;i++){
			b[i]=in.nextInt();
		}
		int c[]=new int[a.length+b.length];
		int k=0;       //inital index
		for(int i=0;i<a.length;i++){
			c[k++]=a[i];    //check k++=a[1]
		}
		for(int j=0;j<b.length;j++){
		  c[k++]=b[j];
		}
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}
	
}
			
		
			
		