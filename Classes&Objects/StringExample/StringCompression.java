/*31. String Compression
Class Name: StringCompression
Methods:
void setString(String str)
String compress()
Description
Compress repeated characters.
Example
Input:"aaabbcc"
Output:"a3b2c2"*/

import java.util.*;
public class StringCompression{
	private String Str;
	public void setString(String s){
		Str=s;
	}
	public String compress(){
		int count=1;
		String result="";
		for(int i=0;i<Str.length()-1;i++){
			if(Str.charAt(i)==Str.charAt(i+1)){
				count++;
			}
			else{
				result=result+Str.charAt(i)+count;
				count=1;
			}
			
		}
		result=result+Str.charAt(Str.length()-1)+count;
		return result;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		StringCompression c=new StringCompression();
		System.out.println("enter String");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.compress());
	}
}
			
