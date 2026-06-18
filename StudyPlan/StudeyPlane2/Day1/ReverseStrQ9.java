/*9. Reverse a string.*/

import java.util.*;
public class ReverseStrQ9{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s=in.nextLine();
		String result="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			  result=result+ch;
		}
		System.out.println(result);
	}
}