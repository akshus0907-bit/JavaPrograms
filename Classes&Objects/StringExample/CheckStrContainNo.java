/*27. Check String Contains Number
Class Name: ContainsNumber
Methods:
void setString(String str)
boolean hasNumber()
Example
Input:"Java123"
Output:true*/

import java.util.*;
public class CheckStrContainNo{
	private String Str;
	
	public void setString(String s){
		Str=s;
	}
	public boolean hasNumber(){
		
		for(int i=0;i<Str.length();i++){
			char ch=Str.charAt(i);
			if(ch>='0' &&ch<='9'){
				return true;
			}
		}
		return false;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CheckStrContainNo c=new CheckStrContainNo();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.hasNumber());
	}
}
				