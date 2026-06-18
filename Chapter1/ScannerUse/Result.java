/*Question 48: Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
Input:
Marks = 38

Output:
Fail

Explanation:
If marks ? 40, the result is Pass.
If marks are below 40, the result is Fail.*/

import java.util.*;
public class Result{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter marks");
		int marks =in.nextInt();
		String d=(marks>=40)?"pass":"fail";
		System.out.println(d);
	}
}
