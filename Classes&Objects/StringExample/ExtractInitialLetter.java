/*23. Extract Initial Letters
Class Name: InitialExtractor
Methods:
void setString(String str)
String getInitials()
Example
Input: "Central Processing Unit"
Output: "CPU"*/

import java.util.*;
public class ExtractInitialLetter{
	private String Str;
	public void setString(String s){
		Str=s;
	}
	public String getInitials(){
		String result="";
		result=result+Character.toUpperCase(Str.charAt(0));
		for(int i=1;i<Str.length()-1;i++){
			if(Str.charAt(i-1)==' '){
				result=result+Character.toUpperCase(Str.charAt(i));
			}
		}
		return result;
	}
			
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ExtractInitialLetter e=new ExtractInitialLetter();
		System.out.println("enter String");
		String s=in.nextLine();
		e.setString(s);
		System.out.println(e.getInitials());
	}
}
