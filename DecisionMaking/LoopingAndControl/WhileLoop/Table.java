/*Question 9: Write a java program to print a multiplication table of any number.
Input:

Number = 5

Output:

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

Explanation:

The program multiplies the given number by values from 1 to 10.
Each result is printed in table format.*/

import java.util.*;
public class Table{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=1;
		while(count<=10){
			int a=n*count;
			count++;
			System.out.println(a);
		}
	}
}