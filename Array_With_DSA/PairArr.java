/*Question 26: Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
Input:
Array = [1, 5, 7, -1, 5]
Sum = 6

Output:
Number of Pairs = 3

Explanation:
Check all possible pairs in the array and count those pairs whose sum equals the given value.

Asked In Companies:*/

import java.util.*;
public class PairArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter sum");
		int sum=in.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}