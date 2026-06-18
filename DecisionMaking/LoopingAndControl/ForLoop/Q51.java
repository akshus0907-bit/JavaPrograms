/*Question 51: Write a java program to display following series :
1 2 2 4 3 6 4 8 5 10 6 12
Input:

n = 6 (number of pairs)

Output:

1 2 2 4 3 6 4 8 5 10 6 12

Description:

The series prints two numbers in each step.
First number increases by 1 (1,2,3,4,5,6).
Second number is double of the first number.*/

import java.util.*;
public class Q51{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i);
			System.out.println(i*2);
		}
	}
}