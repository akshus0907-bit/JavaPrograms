//remove Duplicate

import java.util.*;

public class RemoveDuplicate{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter string");
		String s=in.nextLine();
		String result="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if(result.indexOf(ch)==-1)
				result=result+ch;
		}
		System.out.println(result);
	}
}