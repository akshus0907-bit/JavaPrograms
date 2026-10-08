/*WAP to input string and convert it from lower case to upper case without using toUpperCase() function*/
import java.util.*;
class LowerToUpperStr{
	public static void main(String[]args){
		String str="java";
		String result="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>=97 && ch<=122){
				ch=(char)((int)ch-32);
			}
			result=result+ch;
		}
		System.out.println(result);
	}
}
			