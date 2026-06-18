/*Question 52: Write a java program to display top three value from array.
Input:
Array = [78, 90, 90, 86, 85, 92, 70, 92]

Output:
Top Three Values = 92, 90, 86

Explanation:
Traverse the array and identify the three largest distinct values by comparing elements 
and updating the first, second, and third maximum values accordingly while ignoring duplicates.*/

import java.util.*;
public class LargestValueArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of value in aaray");
		int n=in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			int num=a[i];
			
			if(num==first||num==second||num==third){
				continue;
			}
			if(num>first){
				third=second;
				second=first;
				first=num;
			}
			else if(num>second){
				third=second;
				second=num;
			}
			else if(num>third){
				third=num;
			}
		}
		System.out.println(first+ " "+second+" " +third);
	}
}
		
