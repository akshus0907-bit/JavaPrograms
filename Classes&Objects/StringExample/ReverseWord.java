/*24.Reverse Each Word
class Name=ReverseEachWord
method:
Void setString(String str)
String reverseWord()
example 
input:"java language"
output:"avaj egaugnal"*/

import java.util.*;
public class ReverseWord{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String reverseWord(){
		String ans="";
		for(int i=Str.length()-1;i>=0;i--){
			char ch=Str.charAt(i);
			if(ch!=' '){
				ans=ans+ch;
			}
		}
		return ans;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ReverseWord r=new ReverseWord();
		System.out.println("enter String");
		String s=in.nextLine();
		r.setString(s);
		System.out.println(r.reverseWord());
	}
}
				
