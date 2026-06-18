/*16. Find the ASCII value of each character*/

import java.util.*;
public class ASCIIValueQ16{
	private String str;
	
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public void asciiValue(){
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i)+" ="+(int)str.charAt(i));
		}
		
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		ASCIIValueQ16 v=new ASCIIValueQ16();
		System.out.println("enter string");
		String s=in.nextLine();
		v.setString(s);
		v.asciiValue();
	}
}