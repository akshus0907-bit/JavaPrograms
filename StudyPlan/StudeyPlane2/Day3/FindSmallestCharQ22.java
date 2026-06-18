/*22. Find the smallest character in a string.*/

import java.util.*;
public class FindSmallestCharQ22{
	private String str;
	
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public char findSmallest(){
		char smalles=str.charAt(0);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)<smalles){
				smalles=str.charAt(i);
			}
		}
		return smalles;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		FindSmallestCharQ22 f=new FindSmallestCharQ22();
		System.out.println("enter string");
		String s=in.nextLine();
		f.setString(s);
		System.out.println(f.findSmallest());
	}
}