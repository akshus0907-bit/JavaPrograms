/*3. Reverse String
Problem Statement
Create class ReverseString with methods:
void setString(String str)
String getReverse()
Method Description
void setString(String str)
Stores string into variable.
String getReverse()
Returns reverse of string.
Example
Input: "Java"
Output: "avaJ"
Explanation
Characters are printed from last to first.
*/

import java.util.*;
public class ReverseString{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public String getReverse(){
		String rev="";
		for(int i=Str.length()-1;i>=0;i--){
			char ch=Str.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		ReverseString r=new ReverseString();
		System.out.println("enter string");
		String s=in.nextLine();
		r.setString(s);
		System.out.println("reverse of String ="+r.getReverse());
	}
}
