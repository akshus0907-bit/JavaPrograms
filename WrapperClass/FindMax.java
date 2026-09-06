/*Question 3: Write a Java program to find the maximum number using Integer wrapper objects created through autoboxing.
Asked In Practice Assignment
Input:
Enter size: 4
Enter numbers: 45 78 12 90

Output:
Maximum number is: 90

Explanation:
Read 4 numbers as primitive int and store in Integer array via autoboxing. To find maximum, initialize max with first element (or Integer.MIN_VALUE). Loop through array, unbox each Integer to int during comparison. Compare current element with max. If current > max, update max value. After loop completes, max contains largest value 90.*/

import java.util.*;
public class FindMax{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number of element");
		int size=in.nextInt();
		
		Integer arr[]=new Integer[size];
		System.out.println("enter number of element");
		for(int i=0;i<size;i++){
			int num=in.nextInt();
			
			arr[i]=num;
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}