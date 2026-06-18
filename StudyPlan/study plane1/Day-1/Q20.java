/*20. Find ASCII Value of Characters (No LeetCode)
Given a character or string, print the ASCII value corresponding to each character.
Example: Input: "A" → Output: 65*/

import java.util.*;
public class Q20{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		System.out.println(ch[i]+ " "+(int)ch[i]);
		}
	}
}
			