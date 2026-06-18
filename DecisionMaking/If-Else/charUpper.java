/*Question 24: Write a java program to check whether a character is uppercase or lowercase alphabet.
Input:
Character = A

Output
Uppercase Alphabet

Explanation:
Character 'A' lies between 'A' and 'Z', so it is uppercase.*/

import java.util.*;
public class charUpper{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=in.next().charAt(0);
		if (ch>='a'&&ch<='z'){
			System.out.println("lowercase Alphabet");
		}
		else{
			System.out.println("uppercase Alphabet");
		}
	}
}