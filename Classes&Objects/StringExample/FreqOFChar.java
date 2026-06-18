/*14. Find Frequency of Character
Class Name: CharacterFrequency
Methods:
void setData(String str, char ch)
int getFrequency()
Description
Count how many times a character appears.
Example
Input:"banana", 'a'
Output:3*/

import java.util.*;
public class FreqOFChar{
	private String Str;
	private char ch;
	
	public void setData(String s,char ch){
		Str =s;
		this.ch= ch;
	}
	public int getFrequency(){
		int frequence=0;
		for(int i=0;i<Str.length();i++){
			if(Str.charAt(i)==ch){
				frequence++;
		}
	}
	return frequence;
	}
	
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FreqOFChar f=new FreqOFChar();
		System.out.println("enter string");
		String s=in.nextLine();
		System.out.println("entr char ");
		char ch=in.next().charAt(0);
		f.setData(s ,ch);
		System.out.println("frequence="+f.getFrequency());
	}
}
		
			
