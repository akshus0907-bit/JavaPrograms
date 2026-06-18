/*24. Check whether a string contains only alphabets.*/

import java.util.*;
public class CheckStrAlphQ24{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public boolean findAlpg(){
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if((ch<'a' && ch>'z')&&
			(ch<'A'&&ch>'Z')){
				return false;
			}
		}
		return true;
	}
	public static void  main(String[]args){
		Scanner in=new Scanner(System.in);
		CheckStrAlphQ24 c=new CheckStrAlphQ24();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		System.out.println(c.findAlpg());
	}
}