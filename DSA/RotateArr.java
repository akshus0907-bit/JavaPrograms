/*Question 24: Write a program in java to rotate an array by N positions ?
Input:
Array = [0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27]
Position = 4

Output:
Rotated Array = [12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9]

Explanation:
Split the array into two parts at the given position and place the 
second part first followed by the first part to complete the rotation.*/

import java.util.*;
public class RotateArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int a[]=new int[10];
		int b[]=new int[10];
		
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("enter position");
		int pos=in.nextInt();
		int n=a.length;
		for(int i=0;i<b.length;i++){
			b[i]=a[(i+pos)%n];
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
			