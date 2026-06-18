/*Question 18: Write a Java program to check whether a given array is empty or not.
Input :- Array elements: { } Explanation
1. Every array has a predefined property called length.
2. If array.length == 0, then the array is empty.
3. Otherwise, the array contains elements.
Output :- Array is empty*/

import java.util.*;
public class ArrisEmptyorNot{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter array element");
		int size=in.nextInt();
		int n[]=new int[size];
		for(int i=0;i<n.length;i++){
			n[i]=in.nextInt();
		}
		
			if(n.length==0){
				System.out.println("array is empty");
			}
			else{
				System.out.println("array is not empty");
			}
	}
}
		