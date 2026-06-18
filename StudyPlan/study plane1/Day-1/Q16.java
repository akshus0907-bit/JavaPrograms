/*16. Reverse Words in a String III (LC 557)
Given a sentence, reverse the characters of each word while preserving the original order of the
words and spaces.
Example: Input: "Hello World" → Output: "olleH dlroW"*/

import java.util.*;
public class Q16{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
	       
		}
		String word="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				word=word+ch[i];
			}
			if(ch[i]==' '){
				for(int j=word.length()-1;j>=0;j--){
					System.out.println(word.charAt(j));
				}
				System.out.println(" ");
				word=" ";
			}
		}
		for(int j=word.length()-1;j>=0;j--){
			System.out.println(word.charAt(j));
		}
	}
}