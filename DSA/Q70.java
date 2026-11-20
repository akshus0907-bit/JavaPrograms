/*Question 70: Binary Search (Sorted Array)
Description:
Search target using binary search.
Input:
[1,3,5,7,9]
Target = 7

Output:
Found

Explanation:
Each step halves search space.

Time Complexity: O(log n)*/

import java.util.*;
public class Q70{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter element in array");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter search key ");
		int key=in.nextInt();
		int l=0,mid=0,r=(a.length-1);
		int index=-1;
		
		while(l<=r){
			mid=(l+r)/2;
			if(a[mid]==key){
				index=mid;
				break;
			}
			
		
		   if(a[mid]<key){
			l=mid+1;
		}
	      else{
			r=mid-1;
		}
		}
		if(index!=-1){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
	}
}
}
			
		