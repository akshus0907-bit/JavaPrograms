/*Question 66: Check if Number is Even
Description:
Check if a number is even or odd.
Input:
n = 25

Output:
Odd

Explanation:
Only one operation.

Time Complexity: O(1)*/

import java.util.*;
public class Q66{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		if(n%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}
