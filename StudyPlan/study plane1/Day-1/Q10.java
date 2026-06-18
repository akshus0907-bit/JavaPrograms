/*10. Concatenate Two Strings (No LeetCode)
Given two strings, combine them into a single string and return the result. The original order of
characters must remain unchanged.
Example: Input: "Hello", "World" → Output: "HelloWorld"*/

import java.util.*;
public class Q10{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=in.nextLine();
		System.out.println("enter second string");
		String s2=in.nextLine();
		
		System.out.println(s1+s2);
	}
}
