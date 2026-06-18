/*Question 3: Write a java program to print all alphabets from a to z. - using while loop
Input:

No input required

Output:

a b c d e f ... z

Explanation:

The program starts from character ‘a’ and prints each character until ‘z’.
The loop increments the character in every iteration.*/

import java.util.*;
public class Alphabet{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		char ch='a';
		while( ch<='z'){
			
			System.out.println(ch);
			ch++;
		}
	}
}
	
