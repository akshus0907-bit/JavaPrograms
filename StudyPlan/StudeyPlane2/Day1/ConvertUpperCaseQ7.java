/*7. Convert a string to uppercase.*/

import java.util.*;
public class ConvertUpperCaseQ7{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		String result="";
		for(int  i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'){
			
			ch=(char)(ch-32);
			
		}
			result=result+ch;
		}
	
		System.out.println(result);
	}
}
		