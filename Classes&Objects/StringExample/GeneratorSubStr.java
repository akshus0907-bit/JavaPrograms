/*32. Generate All Substrings
Class Name: SubstringGenerator
Methods:
void setString(String str)
void generateSubstring()
Description
Generate every possible substring.
Example
Input:"abc"
Output:a, b, c, ab, bc, abc*/

import java.util.*;
public class GeneratorSubStr{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public void generateSubstring(){
		for(int i=0;i<Str.length();i++){
			for(int j=i;j<Str.length();j++){
				System.out.println(Str.substring(i,j+1));
			}
		}
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		GeneratorSubStr g=new GeneratorSubStr();
		System.out.println("enter String");
		String s=in.nextLine();
		g.setString(s);
		 g.generateSubstring();
	}
}