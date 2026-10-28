//longestSentence

import java.util.*;
public class FindLongestWord{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter sentence");
		String s=in.nextLine();
		
		String word="";
		String longest="";
		
		for(int i=0;i<s.length();i++){
			if(i<s.length() && s.charAt(i)!=' '){
				word=word+s.charAt(i);
			}
			else{
				if(word.length()>longest.length())
					
				longest=word;
				word="";
			}
		}
		System.out.println("longest word="+longest);
	}
}