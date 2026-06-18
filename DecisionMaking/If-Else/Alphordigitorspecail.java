/*Question 10: Write a java program to input any character and check whether it is alphabet, digit or special character.
Input:
Character = 5

Output:
Digit

Explanation:
Check ASCII ranges.*/

import java.util.*;
public class Alphordigitorspecail{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter a character");
		char ch =in.next().charAt(0);
		if(ch>='a' &&ch<='z' ||ch>='A'&&ch<='Z'){
			System.out.println("alphabet");
		}
		else if(ch>='1' && ch<='9'){
			System.out.println("didgit");
		}
	    else{
            System.out.println("special character");
		}
	}
}	
	