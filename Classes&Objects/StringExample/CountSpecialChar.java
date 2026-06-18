/*13. Count Special Characters
Class Name: SpecialCharacterCount
Methods:
void setString(String str)
int getSpecialCharacterCount()
Description
Counts symbols like @,#,$,%,&.
Example
Input: "Java@123#"
Output: 2*/

import java.util.*;
public class CountSpecialChar{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getSpecialCharacterCount(){
		int count=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(!(ch>='a'&&ch<='z' ||
			ch>'A'&&ch<='Z'||
			ch>='0' &&ch<='9')){
				count++;
				System.out.println(ch);
			}
		}
			return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountSpecialChar c=new CountSpecialChar();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println("count="+c.getSpecialCharacterCount());
	}
}
