/*Question 16: Write a Java program to calculate the average of all elements present in an integer array.
Input Array:
[10, 20, 30, 40, 50]
Output:
Average of array elements = 30
Explanation:=
? The average of array elements is calculated by:
Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}
{\text{Number of elements}}Average=Number of elementsSum of all elements
? First, iterate through the array and add all elements to a variable sum.
? Then divide sum by the total number of elements (array.length) to get the average.*/

import java.util.*;
public class AvgOfArray{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		//int n=in.nextInt();
		System.out.println("enter 5 number");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		
		
			int avg=sum/a.length;
		
		System.out.println("avg is ="+avg);
	}
}
		
		
		