/*18. Toggle Case of Characters (No LeetCode)
Given a string, change all uppercase letters to lowercase and all lowercase letters to uppercase.
Return the transformed string.
Example: Input: "HeLLo" → Output: "hEllO"*/

import java.util.*;
public class Q18{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A' && ch[i]<='Z'){
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a' &&ch[i]<='z'){
				ch[i]=(char)(ch[i]-32);
			}
		}
		System.out.println(ch);
	}
}