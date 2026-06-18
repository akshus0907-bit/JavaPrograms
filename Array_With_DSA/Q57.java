/*Question 57: Count Iterations of a Simple Loop
Description:
You are given an integer n. A loop runs from 1 to n and prints each number.
You must determine how many times the loop executes and analyze its time complexity.
Input:
n = 5

Output:
1 2 3 4 5
Total iterations: 5

Explanation:
The loop runs exactly n times.
If n = 5 ? 5 iterations
If n = 100 ? 100 iterations

Time Complexity: O(n)
Because execution grows linearly with input size.*/

import java.util.*;
public class Q57{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter aaray element");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}