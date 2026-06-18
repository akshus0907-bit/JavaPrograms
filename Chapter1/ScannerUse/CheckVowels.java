/*Question 39: Write a Java program to input an alphabet and check whether it is a vowel or consonant.
Input:
Alphabet = e

Output:
Vowel

Explanation:
Vowels are a, e, i, o, u (both uppercase and lowercase).
All other alphabets are consonants.*/

import java.util.*;
public class CheckVowels{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a alphabet");
		char ch=in.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println("vowel");
		}
		else{
			System.out.println("not vowel");
		}
	}
}
