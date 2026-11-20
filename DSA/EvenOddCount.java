/*Question 5: Write a Java program to count even & odd values from an array.
Input:
Array Size = 7
Array Elements = 12 17 24 39 40 55 70
Output:
Count of Even Values = 4
Count of Odd Values = 3
Explanation:
? Initialize counters: evenCount = 0, oddCount = 0.
? For each element in the array:

? If divisible by 2 ? increase evenCount.
? Otherwise ? increase oddCount.

? Final counts are displayed.*/

import java.util.*;
public class EvenOddCount{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		int a[]=new int[7];
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				evencount++;
				
			}
			
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				oddcount++;
				
			}
			
		}
		System.out.println("Count of Even Values = " + evencount);
        System.out.println("Count of Odd Values = " + oddcount);
	}
}
	