/*Question 29: Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
Input:
Array = [1, 2, 3, 4, 5, 6]

Output:
Array = [2, 1, 4, 3, 6, 5]

Explanation:
Place an even number first followed by an odd number repeatedly until all elements are arranged alternately.*/

import java.util.*;
public class AlternateEvenOddArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter array element");
		int evencount[]=new int[3];
		int oddcount[]=new int[3];
		int result[] = new int[evencount +oddcount];
		
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0i<evencount;i++){
			if(a[i]%2==0){
				evencount();
			}
		}
		for(int i=0;i<oddcount;i++){
			if(a[i]%2!=0){
				oddcount();
			}
		}
	}
}