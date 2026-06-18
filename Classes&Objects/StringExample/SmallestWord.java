/*26. Find Smallest Word
Class Name: SmallestWord
Methods:
void setString(String str)
String getSmallestWord()
Example
Input: "Java is easy"
Output: "is"*/

import java.util.*;
public class SmallestWord{
	private String Str;
	
	public void setString(String t){
		Str=t;
	}
	public String getSmallestWord(){
		String word="";
		String SmallestWord=null;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch!=' '){
				word=word+ch;
			}
			else{
				if(SmallestWord==null || word.length()<SmallestWord.length()){
					SmallestWord=word;
				}
				word="";
			}
		}
		if(SmallestWord==null ||word.length()<SmallestWord.length()){
					SmallestWord=word;
			}
			return SmallestWord;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		SmallestWord s=new SmallestWord();
		System.out.println("enter String");
		String S=in.nextLine();
		s.setString(S);
		System.out.println(s.getSmallestWord());
	}
}
