/*10. Find First Character
Problem Statement
Create class FirstCharacter with methods:
void setString(String str)
char getFirstCharacter()
Method Description
void setString(String str)
Stores string.
char getFirstCharacter()
Returns first character from string.
Example
Input: "Computer"
Output: 'C'*/

import java.util.*;
public class FindFirstChar{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public char getFirstCharacter(){
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			return ch;
			
		}
		return ' ';
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FindFirstChar f=new FindFirstChar();
		System.out.println("enter string");
		String s=in.nextLine();
		f.setString(s);
		System.out.println(f.getFirstCharacter());
	}
}
