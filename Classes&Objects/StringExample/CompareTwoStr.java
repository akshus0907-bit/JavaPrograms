/*9. Compare Two Strings
Problem Statement
Create class CompareString with methods:
void setStrings(String s1, String s2)
boolean isEqual()
Method Description
void setStrings(String s1, String s2)
Accepts two strings.
boolean isEqual()
Compares both strings and returns true if same.
Example
Input:
 "java", "java"
Output:
 true
*/

import java.util.*;
public class CompareTwoStr{
	private String Str1;
	private String Str2;
	
	public void setString(String s1 ,String s2){
		Str1=s1;
		Str2=s2;
	}
	
	
	public boolean isEqual(){
		if(Str1.length()!=Str2.length()){
			return false;
		}
		for(int i=0;i<Str1.length();i++){
			char ch1=Str1.charAt(i);
			char ch2=Str2.charAt(i);
			
			if(ch1>'A' &&ch1<'Z'){
			ch1=(char)(ch1+32);
			}
			if(ch2>='A' && ch2<='Z'){
				
				ch2=(char)(ch2+32);
			}
		
			if(ch1==ch2){
				return true;
			}
		}
			return false;
		}
				
	
	
	
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		CompareTwoStr c=new CompareTwoStr();
		System.out.println("enter first string");
		String s1=in.nextLine();
		System.out.println("enter secong string");
		String s2=in.nextLine();
		c.setString(s1,s2);
		System.out.println(c.isEqual());
	}
	
}