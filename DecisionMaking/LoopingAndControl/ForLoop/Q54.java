/*Question 54: Write a java program to display following series :
1 2 4 7 11 16 22 29 37 46.
Input:

n = 10

Output:

1 2 4 7 11 16 22 29 37 46

Description:

The difference between terms increases by 1:
+1, +2, +3, +4, +5, +6*/

import java.util.*;
public class Q54{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int num=1;
		int dif=1;
		
		for(int i=1;i<=n;i++){
			System.out.println(num+ " ");
			num=num+dif;
			dif++;
		}
	}
}