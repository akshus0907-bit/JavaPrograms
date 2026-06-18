/*Question 4: Write a Java program to display even & odd index values from an array.
Input:
Array Size = 6
Array Elements = 5 10 15 20 25 30
Output:
Values at Even Index = 5 15 25
Values at Odd Index = 10 20 30
Explanation:
? Index starts from 0.
? Even index positions are 0, 2, 4, ….
? Odd index positions are 1, 3, 5, ….
? We print the values according to their index category.*/

import java.util.*;
public class EvenOddIndex{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[6];
		int evenindex=0;
		int oddindex=0;
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		System.out.println("value at even index");
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				System.out.println(a[i]);
			}
		}
		System.out.println("value at odd index=");
		for(int i=0;i<a.length;i++){
			if(i%2!=0){
				System.out.println(a[i]);
			}
		}
	}
}
		