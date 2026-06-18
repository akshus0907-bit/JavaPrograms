/*Question 72: Print All Subarrays
Description:
Print all possible subarrays of array size n.
Input:
[1,2,3]

Output:
[1] [1,2] [1,2,3] [2] [2,3] [3]

Time Complexity: O(n²)*/

import java.util.*;
public class Q72{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter  number of element");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
			System.out.println("[");
			for(int k=i;k<=j;k++){
				System.out.print(a[k]);
			}
			System.out.println("]");
			}
		}
	}
}