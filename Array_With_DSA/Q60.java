/*Question 60: Print n² Pattern
Description:
Print an n × n matrix using nested loops.
Input:
n = 3

Output:
Total operations: 9

Explanation:
Outer loop runs n times
Inner loop runs n times

Total operations = n × n

Time Complexity: O(n²)*/

import java.util.*;
public class Q60{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter value of n");
		
		int n=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				count++;
			}
		}
		System.out.println(count);
	}
}
				