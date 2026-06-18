/*Question 36: Write a Java program to check whether a character is an alphabet or not.
Input:
Character = A

Output:
Alphabet

Explanation:
If the character lies between A–Z or a–z, it is an alphabet.
Otherwise, it is not.*/

import java.util.*;
public class CheckCharacter{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter a character");
		char ch=in.next().charAt(0);
		if(ch>='A'&&ch<='Z'|| ch>='A'&&ch<='Z'){
			
			System.out.println("character is an alphabet");
		}
		else{
			System.out.println("character is not alphabet");
		}
	}
}