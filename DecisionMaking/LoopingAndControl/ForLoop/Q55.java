/*Question 55: Write a java program to display following series :
5 3 10 6 15 9 20 12 25 15 30 18 35 21 40
Input:

n = 8 (for first 8 pairs)

Output:

5 3 10 6 15 9 20 12 25 15 30 18 35 21 40

Description:

The series alternates between:

Multiples of 5 (5,10,15,20…)

Multiples of 3 (3,6,9,12…)*/

import java.util.*;
public class Q55{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(5*i);
			System.out.println(3*i);
		}
	}
}