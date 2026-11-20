/*Question 42: Write a program in java to to print next greater elements in a given unsorted array. 
Elements for which no greater element exist, consider next greater element as -1.
Input:
Array = [5, 3, 10, 9, 6, 13]

Output:
Next Greater Elements = [10, 10, 13, 13, 13, -1]

Explanation:
For each element search the right side of the array and find the first element greater than it; if none exists return -1.

Asked In Companies:
Practice assignment*/

import java.util.*;
public class NextGreaterNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int count=0;
		System.out.println("next greater element=");
		for(int i=0;i<a.length;i++){
			int next=-1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					next=a[j];
					break;
				}
			}
			System.out.println(next);
		}
	}
}
			
					

