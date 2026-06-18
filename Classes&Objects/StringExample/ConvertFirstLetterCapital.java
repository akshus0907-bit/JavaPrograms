/*29. Convert First Letter Capital
Class Name: CapitalizeWord
Methods:
void setString(String str)
String capitalize()
Example
Input:"java programming"
Output:"Java Programming"*/

import java.util.*;
public class ConvertFirstLetterCapital{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String capitalize(){
		String result="";
		
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(i==0||Str.charAt(i-1)==' '){
				result=result+Character.toUpperCase(ch);
			}
			else{
				result=result+ch;
			}
		}
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ConvertFirstLetterCapital c=new ConvertFirstLetterCapital();
		System.out.println("enter String");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.capitalize());
	}
}
		
