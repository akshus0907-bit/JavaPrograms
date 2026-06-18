/*40. Convert Sentence into Pig Latin
Class Name: PigLatinConverter
Methods:
void setString(String str)
String convertPigLatin()
Example
Input:"java"
Output:"avajay"*/

import java.util.*;
public class SentenceIntoPigLatin{
	private String Str;
	public void setString(String s){
		Str=s;
	}
	public String convertPigLatin(){
		if(Str.length()<=1){
			return Str+"ay";
		}
	
		return Str.substring(1)+Str.charAt(0)+"ay";
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		SentenceIntoPigLatin t=new SentenceIntoPigLatin();
		System.out.println("enter String");
		String s=in.nextLine();
		t.setString(s);
		System.out.println(t.convertPigLatin());
	}
}
 
