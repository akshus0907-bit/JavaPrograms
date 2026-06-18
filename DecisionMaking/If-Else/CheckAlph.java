/*Question 6: Write a Java program to check whether a character is alphabetic or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If character lies between A–Z or a–z.*/

import java.util.*;
public class CheckAlph{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter a alphabetic");
		char ch=in.next().charAt(0);
		if(ch>='A' && ch<='Z' ||  ch>='a' && ch<='z') {
			System.out.println("alphabet");
		}
		
		else {
			System.out.println("not alphabet");
		}
	}
}