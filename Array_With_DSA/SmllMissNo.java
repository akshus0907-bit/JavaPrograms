/*Question 39: Write a program in java to find the smallest missing element from a sorted array?
Input:
Array = [0, 1, 3, 4, 5, 6, 7, 9]

Output:
Smallest Missing Element = 2

Explanation:
Traverse the array and compare each element with its expected index value; the first mismatch indicates the missing number.

Asked In Companies:
Practice assignment*/

import java.util.*;
public class SmllMissNo{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=i){
				System.out.println(" Smallest missing element "+i);
				break;
			}
		}
	}
}