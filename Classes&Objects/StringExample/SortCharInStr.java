/*17. Sort Characters in String
Class Name: SortString
Methods:
void setString(String str)
String sortCharacters()
Description
Arrange characters alphabetically.
Example
Input:"dcba"
Output: "abcd"*/

import java.util.*;
public class SortCharInStr{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String sortCharacters(){
		char ch[]=new char[Str.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=Str.charAt(i);
		}
		for(int i=0;i<ch.length-1;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return new String(ch);
	}
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		SortCharInStr x=new SortCharInStr();
		System.out.println("enter String");
		String s=in.nextLine();
		x.setString(s);
		System.out.println("sorted string="+x.sortCharacters());
	}
}
		
