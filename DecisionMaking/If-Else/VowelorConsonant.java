/*Question 9: Write a java program to input any alphabet and check whether it is vowel or consonant.
Input:
Character = e

Output:
Vowel

Explanation:
Vowels: a, e, i, o, u.*/

import java.util.*;
public class VowelorConsonant{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a character ");
		char ch=in.next().charAt(0);
		
		if(ch=='a' ||ch=='i'||ch=='e'||ch=='o'||ch=='u' || ch=='A' ||ch=='I'||ch=='E'||ch=='O'||ch=='U'){
			System.out.println("vowel");
		}
		else{
			System.out.println("not vowel");
		}
	}
}
			