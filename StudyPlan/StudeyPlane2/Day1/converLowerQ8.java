/*8. Convert a string to lowercase.*/
import java.util.*;
public class ConverLowerQ8{
public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		String result="";
		for(int  i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z'){
			
			ch=(char)(ch+32);
			
		}
			result=result+ch;
		}
	
		System.out.println(result);
	}
}
		