/*Question 61: Loop that Divides n by 2 Each Time
Description:
Given n, divide n by 2 until it becomes 1.
Input:
n = 16

Output:
16 ? 8 ? 4 ? 2 ? 1
Total steps: 4

Explanation:
Each iteration halves the value.
Number of steps = log?(n)

Time Complexity: O(log n)*/

import java.util.*;
public class Q61{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=in.nextInt();
		for(int i=n;i>=1;i=i/2){
			System.out.println(i);
		}
	}
}