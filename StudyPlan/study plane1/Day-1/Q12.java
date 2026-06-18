/*12. Replace Spaces with Hyphens (LC 1592 Inspired)
Given a string containing spaces, replace every space character with a hyphen (-) and return the
modified string.
Example: Input: "hello world" → Output: "hello-world"*/

import java.util.*;
public class Q12{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' '){
				ch[i]='-';
			}
		}
			System.out.println(ch);
		
	}
}
		
		