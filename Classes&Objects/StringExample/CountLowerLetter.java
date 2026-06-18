/*21. Count Lowercase Letters
Class Name: LowerCaseCount
Methods:
void setString(String str)
int getLowerCaseCount()
Example
Input:"JaVA"
Output:1*/

import java.util.*;
public class CountLowerLetter{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getLowerCaseCount(){
		int count=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='a' && ch<='z'){
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountLowerLetter c=new CountLowerLetter();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println("count="+c.getLowerCaseCount());
	}
}
