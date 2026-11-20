/*Question 44: Write a program in java to find out the maximum difference between
 any two elements such that larger element appears after the smaller number.
Input:
Array = [7, 9, 5, 6, 13, 2]

Output:
Maximum Difference = 8

Explanation:
Find a pair where the smaller element appears before the larger element and the difference between them is maximum.*/

import java.util.*;
public class MaxDiffArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int diff=0;
		int mindiff=7;
		for(int i=0;i<a.length;i++){
			if(a[i]<mindiff){
				mindiff=a[i];
			}
			for(int j=i+1;j<a.length;j++){
				int current=a[j]-a[i];
				if(current>diff){
					diff=current;
				}
			}
		}
		System.out.println(diff);
	}
}
			
			