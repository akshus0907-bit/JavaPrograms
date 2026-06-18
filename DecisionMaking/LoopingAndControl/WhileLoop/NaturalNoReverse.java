/*Question 2: Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
Input:

n = 5

Output:

5 4 3 2 1

Explanation:

The program starts from n and decreases the number by 1 each time.
The loop runs until the number becomes 1.*/

import java.util.*;
public class NaturalNoReverse{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count=n;
		while(count>=1){
			System.out.println(count);
			count--;
		}
	}
}