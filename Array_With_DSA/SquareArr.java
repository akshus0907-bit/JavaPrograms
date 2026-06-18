/*Question 35: Create a new array where each element is the square of the original.
Input:
Array = [2, 4, 6, 8]

Output:
New Array = [4, 16, 36, 64]

Explanation:
For each index multiply the element with itself and store the result in a new array.*/

import java.util.*;
public class SquareArr{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("ënter array element");
		int a[]=new int[4];
		int result[]=new int[4];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			
				result[i]=a[i]*a[i];
				System.out.println(result[i]);
		}
	}
}
			