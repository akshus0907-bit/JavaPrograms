/*Question 20: Write a Java program to print all elements from an integer array that are greater than a given number.
Input:
Array = [10, 25, 5, 40, 18]
Given Number = 20

Output:
Elements greater than 20: 25 40

Explanation:
Traverse the array and compare each element with the given number; if the element is greater than the number, print it.*/

import java.util.*;
public class MaxArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		//int size=in.nextInt();
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		
		System.out.println("enter give number");
		
		int n=in.nextInt();
		System.out.println("greater number than="+n);
		for(int i=0;i<a.length;i++){
			if(a[i]>n){
				System.out.println(a[i]);
			}
		}
	}
}
				