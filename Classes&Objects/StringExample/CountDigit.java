/*11. Count Digits in String
Class Name: DigitCount
Methods:
void setString(String str)
int getDigitCount()
Description
Count total numeric digits present in string.
Example
Input: "Java123"
Output: 3*/

import java.util.*;
public class CountDigit{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public int getDigitCount(){
		int count=0;
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='0' && ch<='9'){
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountDigit c=new CountDigit();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.getDigitCount());
	}
}
