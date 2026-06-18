/*15. Replace Character
Class Name: ReplaceCharacter
Methods:
void setData(String str, char oldCh, char newCh)
String replaceCharacter()
Description
Replace old character with new character.
Example
Input:"java", 'a', 'o'
Output: "jovo"*/

import java.util.*;
public class ReplaceChar{
	private String Str;
	private char Oldch;
	private char Newch;
	
	public void setData(String s,char oldch,char newch){
		Str=s;
		Oldch=oldch;
		Newch=newch;
	}
	public String replaceCharacter(){
		String ans="";
		for(int i=0;i<Str.length();i++){
			if(Str.charAt(i)==Oldch){
				ans=ans+Newch;
			}
			else{
				ans=ans+Str.charAt(i);
		}
		
	}
	return ans;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ReplaceChar r=new ReplaceChar();
		System.out.println("enter String");
		String s=in.nextLine(); 
		System.out.println("enter old char");
		char Oldch=in.next().charAt(0);
		System.out.println("enter new char");
		char Newch=in.next().charAt(0);
		r.setData(s,Oldch,Newch);
		System.out.println("new String ="+r.replaceCharacter());
	}
}
		
