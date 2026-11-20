/*Question 69: Linear Search
Description:
Search target in array.
Input:
Array: [4,7,2,9]
Target = 2

Output:
Found

Explanation:
Worst case checks all elements.

Time Complexity: O(n)*/

import java.util.*;
public class Q69{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element ");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter element in array");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter search key");
		int key=in.nextInt();
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
				index=i;
				break;
			}
		}
		if(index!=-1){
			System.out.println("Found="+index);
		}
		else{
			System.out.println("not found");
		}
	}
}