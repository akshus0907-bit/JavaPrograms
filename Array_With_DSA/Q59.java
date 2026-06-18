/*Question 59: Nested Loop with Fixed Inner Loop
Description:
Outer loop runs from 1 to n.
Inner loop runs exactly 5 times.
Input:
n = 4

Output:
Total iterations = 4 × 5 = 20

Explanation:
Inner loop is constant (5 times).
So total operations = 5n

Time Complexity: O(n)*/

import java.util.*;
public class Q59{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=5;j++){
				count++;
			}
		}
		System.out.println("total iterations="+count);
	}
	
	
}