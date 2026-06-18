/*8. Remove Spaces from String (LC 1592 Inspired)
Given a string containing spaces, remove all spaces and return the updated string without
changing the order of remaining characters.
Example: Input: "a b c d" → Output: "abcd"*/

import java.util.*;
public class Q8{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		char b[]=new char[s.length()];
		int j=0;
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
			if(ch[i]!=' '){
				b[j]=ch[i];
				j++;
			}
		}
		System.out.println(b);
	}
}
				