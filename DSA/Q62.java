/*Question 62: Loop that Multiplies by 2 Each Time
Description:
Start from 1 and multiply by 2 until value exceeds n.
Input:
n = 32

Output:
1 2 4 8 16 32

Explanation:
Number doubles every time.
Steps ? log?(n)

Time Complexity: O(log n)*/

import java.util.*;
public class Q62{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=in.nextInt();
		for(int i=1;i<=n;i=i*2){
			System.out.println(i);
		}
	}
}