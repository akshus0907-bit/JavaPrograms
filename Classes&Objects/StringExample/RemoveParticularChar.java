/*28. Remove Particular Character
Class Name: RemoveCharacter
Methods:
void setData(String str, char ch)
String removeCharacter()
Example
Input:"banana", 'a'
Output:"bnn"*/

import java.util.*;
public class RemoveParticularChar{
	private String Str;
	private char ch;
	
	public void setData(String s,char c){
		Str=s;
		ch=c;
	}
	public String removeCharacter(){
		String result="";
		for(int i=0;i<Str.length();i++){
			char chr=Str.charAt(i);
			if(chr!=ch){
				result=result+chr;
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		RemoveParticularChar r=new RemoveParticularChar();
		System.out.println("enter String");
		String s=in.nextLine();
		System.out.println("enter character to remove");
		char c=in.next().charAt(0);
		r.setData(s,c);
		System.out.println(r.removeCharacter());
	}
}