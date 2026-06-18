/*20. Count Uppercase Letters
Class Name: UpperCaseCount
Methods:
void setString(String str)
int getUpperCaseCount()
Example
Input: "JaVA"
Output: 3*/

import java.util.*;
public class CountUppLetter{
	private String Str;
	
	public void setString(String s){
		Str =s;
	}
	public int getUpperCaseCount(){
		int count=0;
		
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='A' && ch<='Z'){
				count++;
			}
		}
		return count;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		CountUppLetter c=new CountUppLetter();
		System.out.println("enter string");
		String S=in.nextLine();
		c.setString(S);
		System.out.println("count="+c.getUpperCaseCount());
	}
}