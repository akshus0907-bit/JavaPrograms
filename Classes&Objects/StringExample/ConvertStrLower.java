/*6. Convert String to Lowercase
Problem Statement
Create class LowerCaseConvert with methods:
void setString(String str)
String getLowerCase()
Method Description
void setString(String str)
Accepts string.
String getLowerCase()
Converts uppercase letters into lowercase.
Example
Input: "JAVA"
Output: "java"
*/

import java.util.*;
public class ConvertStrLower{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String getLowerCase(){
		String lower="";
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='A' &&ch<='Z'){
				ch=(char)(ch+32);
			}
			lower=lower+ch;
		}
		return lower;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		ConvertStrLower c=new ConvertStrLower();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println("Lower case="+c.getLowerCase());
	}
}
