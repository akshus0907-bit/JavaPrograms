/*12. Remove Spaces from String
Class Name: RemoveSpaces
Methods:
void setString(String str)
String removeSpace()
Description
Remove all spaces from string.
Example
Input: "Java Programming"
Output: "JavaProgramming"*/

import java.util.*;
public class RemoveSpace{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String getRemoveSpace(){
		String s="";
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch!=' '){
				s=s+ch;
			}
		}
		return s;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		RemoveSpace r=new RemoveSpace();
		System.out.println("enter string");
		String s=in.nextLine();
		r.setString(s);
		System.out.println(r.getRemoveSpace());
	}
}
