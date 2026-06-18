/*5. Convert Lowercase to Uppercase (No LeetCode)
Given a string containing lowercase letters, convert all characters into uppercase and return the
updated string.
Example: Input: "world" → Output: "WORLD"*/

import java.util.*;
public class Q5{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		
		char ch[]=new char[s.length()];
		
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
			if(ch[i]>='a' && ch[i]<='z'){
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println(ch);
	}
}
		