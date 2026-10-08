/*String str = "Hello World";

System.out.println(str.indexOf("l", 4));*/

import java.util.*;
public class CountCharStr{
	public static void main(String[]args){
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		String str=in.nextLine();
		
		System.out.println("enter char to count");
		char ch=in.next().charAt(0);
		int count=0;
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
				
			}
		}
		System.out.println(ch+": "+count);
	}
}