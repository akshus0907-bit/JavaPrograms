/*25. Find Longest Word
Class Name: LongestWord
Methods:
void setString(String str)
String getLongestWord()
Example
Input:"Java is powerful"
Output:"powerful"*/

import java.util.*;
public class LongestWord{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String getLongestWord(){
		String word="";
		String longestword="";
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch!=' '){
				word=word+ch;
			}
			else 
			{
				if(word.length()>longestword.length()){
				longestword=word;
			}
			word="";
		}
	}
	if(word.length()>longestword.length()){
		longestword=word;
	}
	return longestword;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		LongestWord l=new LongestWord();
		System.out.println("enter String");
		String s=in.nextLine();
		l.setString(s);
		System.out.println(l.getLongestWord());
	}
}

	
			
			
		
