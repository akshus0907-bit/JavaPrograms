/*Question 2: Write a Java program to count even numbers using the autoboxing and unboxing concept.
Asked In Practice Assignment
Input:
Enter size: 6
Enter numbers: 11 22 33 44 55 66

Output:
Total even numbers: 3

Explanation:
This program demonstrates autoboxing (int ? Integer) and unboxing (Integer ? int). Read 6 numbers from user as primitive int. Each number assigned to Integer array triggers autoboxing. To check even condition, unboxing converts Integer back to int. A number is even if divisible by 2 (number % 2 == 0). Numbers 22, 44, 66 are even. Count = 3.*/

import java.util.*;
public class CountEvenNum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number of element");
		
		int size=in.nextInt();
		
		Integer arr[]=new Integer[size];
		System.out.println("enter element");
		for(int i=0;i<size;i++){
			int num=in.nextInt();
			arr[i]=num;  // autoboxing 
		}
		int count=0;
			for(int i=0;i<size;i++){
				if(arr[i]%2==0){   //autounboxing
					
				count++;
			}
			}
			System.out.println("count="+count);
	}
}