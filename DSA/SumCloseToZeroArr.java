/*Question 45: Write a program in java to find two elements whose sum is closest to zero.
Input:
Array = [38, 44, 63, -51, -35, 19, 84, -69, 4, -46]

Output:
Pair Closest to Zero = [44, -46]

Explanation:
Check pairs of elements and compute their sums; the pair whose sum 
is nearest to zero is selected.*/

import java.util.*;
public class SumCloseToZeroArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element in aaray");
		int n =in.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter aaray element");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int minsum=Integer.MAX_VALUE;
		int currentSum=0;
		int p1=0,p2=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				currentSum=a[i]+a[j];
			
			if(Math.abs(currentSum)<minsum){
				minsum=currentSum;
				p1=a[i];
				p2=a[j];
			}
			}
		}
	System.out.println(p1+ " " +p2);
	}
}

			
