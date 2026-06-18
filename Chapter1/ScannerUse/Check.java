/*Question 40: Write a Java program to check whether a character is an alphabet, digit, or special character.
Input:
Character = @

Output:
Special Character

Explanation:
If character is between A–Z or a–z ? Alphabet
If between 0–9 ? Digit
Otherwise ? Special Character*/

import java.util.*;
public class Check{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter any characer /digit ");
		char ch=in.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A'&&ch<='Z'){
			System.out.println("is a alphabet");
		}
		else if(ch>='1'&&ch<='9'){
			System.out.println("digit");
		}
		else{
			System.out.println("special character");
		}
	}
}