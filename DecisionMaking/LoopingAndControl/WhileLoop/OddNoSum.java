/*Question 8: Write a java program to find the sum of all odd numbers between
Input:

n = 10

Output:

Sum = 25

Explanation:

Odd numbers between 1 and 10 are 1, 3, 5, 7, 9.
Their sum is 1 + 3 + 5 + 7 + 9 = 25.*/

import java.util.*;
public class OddNoSum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int sum=0;
		int count=1;
		while(count<=n){
			if(count%2!=0){
				sum=sum+count;
			}
			count++;
		}
		System.out.println(sum);
	}
}