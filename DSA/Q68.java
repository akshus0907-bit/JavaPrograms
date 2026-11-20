/*Question 68: Find Duplicate Using Nested Loop
Description:
Check if array contains duplicate elements.
Input:
[1,2,3,2]

Output
Duplicate Found

Explanation:
Each element compared with others.

Time Complexity: O(n²)*/

import java.util.*;
public class Q68{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of elemnt");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in array:");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("duplicate found");
		}
		else{
			System.out.println("duplicate not fount");
		}
	}
}
					