/*Question 56: Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Input:
Character = a

Output:
Vowel

Explanation:
The switch checks for 'a', 'e', 'i', 'o', 'u'. Since 'a' matches, it prints Vowel.

Input:
Character = k

Output:
Consonant

Explanation:
Since 'k' does not match any vowel case, default executes and prints Consonant.*/

import java.util.*;
public class CheckVowel{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter characer");
		char ch=in.next().charAt(0);
		 int c=(int)ch+32;
		 if(ch>='A' ||ch<='Z'){
			 System.out.println("vowel");
		 }
		 else{
			 System.out.println("Cononant");
		switch(ch){
			case 'a':
			System.out.println("vowel");
			break;
			case 'e':
			System.out.println("vowel");
			break;
			case'i':
			System.out.println("vowel");
			break;
			case'o':
			System.out.println("vowel");
			break;
			case'u':
			System.out.println("vowel");
			break;
			default:
		    System.out.println("Consonant");
		}
		 }
	}
}