/*4. To Lower Case (LC 709)
Given a string containing uppercase letters, convert all characters into lowercase and return the
modified string.
Example: Input: "HELLO" → Output: "hello"*/

import java.util.*;
public class Q4{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
			
			if(ch[i]>='A' && ch[i]<='Z'){
				ch[i]=(char)(ch[i]+32);
				
			}
		}
		System.out.println(ch);
	}
}