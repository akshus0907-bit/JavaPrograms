/*Question 17: Write a Java program to count the number of even and odd elements present in a given integer array.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
Odd count = 2 Explanation
? An even number is a number that is completely divisible by 2.
? An odd number is a number that is not divisible by 2.
? Traverse the array using a loop.*/

import java.util.*;
public class EvenOddArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter 5 element in array");
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		System.out.println("EvenCount="+evencount+ " \nOddCount=" +oddcount);
	}
}
		