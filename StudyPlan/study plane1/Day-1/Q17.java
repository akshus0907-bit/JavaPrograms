/*17. Remove Vowels from a String (LC 1119)
Given a string, remove all vowels (a, e, i, o, u) from it and return the resulting string.
Example: Input: "education" → Output: "dctn"*/

import java.util.*;
public class Q17{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter String");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++){
			if(!(ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')){
				System.out.println(ch[i]);
			}
		}
	}
}
